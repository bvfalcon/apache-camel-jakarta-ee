/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.cdi;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;

import jakarta.enterprise.event.Event;
import jakarta.enterprise.inject.Any;
import jakarta.enterprise.inject.Default;
import jakarta.enterprise.inject.InjectionException;
import jakarta.enterprise.inject.Instance;
import jakarta.enterprise.inject.Produces;
import jakarta.enterprise.inject.spi.InjectionPoint;
import org.apache.camel.CamelContext;
import org.apache.camel.ConsumerTemplate;
import org.apache.camel.Endpoint;
import org.apache.camel.FluentProducerTemplate;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.TypeConverter;

import static org.apache.camel.cdi.CdiEventEndpoint.eventEndpointUri;
import static org.apache.camel.cdi.CdiSpiHelper.isAnnotationType;

class CdiCamelFactory {
    protected CdiCamelFactory() {
        // no-op
    }

    @Produces
    private static TypeConverter typeConverter(
            InjectionPoint ip, @Any Instance<CamelContext> instance, CdiCamelExtension extension) {
        return selectContext(ip, instance, extension).getTypeConverter();
    }

    @Produces
    // Qualifiers are dynamically added in CdiCamelExtension
    private static ConsumerTemplate consumerTemplate(
            InjectionPoint ip, @Any Instance<CamelContext> instance, CdiCamelExtension extension) {
        return selectContext(ip, instance, extension).createConsumerTemplate();
    }

    @Produces
    @Default
    @Uri("")
    // Qualifiers are dynamically added in CdiCamelExtension
    private static ProducerTemplate producerTemplate(
            InjectionPoint ip, @Any Instance<CamelContext> instance, CdiCamelExtension extension) {
        return getQualifierByType(ip, Uri.class)
                .map(uri -> producerTemplateFromUri(ip, instance, extension, uri))
                .orElseGet(() -> defaultProducerTemplate(ip, instance, extension));
    }

    private static ProducerTemplate producerTemplateFromUri(
            InjectionPoint ip, @Any Instance<CamelContext> instance, CdiCamelExtension extension, Uri uri) {
        try {
            CamelContext context = selectContext(ip, instance, extension);
            ProducerTemplate producerTemplate = context.createProducerTemplate();
            Endpoint endpoint = context.getEndpoint(uri.value(), Endpoint.class);
            producerTemplate.setDefaultEndpoint(endpoint);
            return producerTemplate;
        } catch (Exception cause) {
            throw new InjectionException("Error injecting producer template annotated with " + uri + " into " + ip, cause);
        }
    }

    private static ProducerTemplate defaultProducerTemplate(
            InjectionPoint ip, @Any Instance<CamelContext> instance, CdiCamelExtension extension) {
        try {
            CamelContext context = selectContext(ip, instance, extension);
            return context.createProducerTemplate();
        } catch (Exception cause) {
            throw new InjectionException("Error injecting producer template into " + ip, cause);
        }
    }

    @Produces
    @Default
    @Uri("")
    // Qualifiers are dynamically added in CdiCamelExtension
    private static FluentProducerTemplate fluentProducerTemplate(
            InjectionPoint ip, @Any Instance<CamelContext> instance, CdiCamelExtension extension) {
        return getQualifierByType(ip, Uri.class)
                .map(uri -> fluentProducerTemplateFromUri(ip, instance, extension, uri))
                .orElseGet(() -> defaultFluentProducerTemplate(ip, instance, extension));
    }

    private static FluentProducerTemplate fluentProducerTemplateFromUri(
            InjectionPoint ip, @Any Instance<CamelContext> instance, CdiCamelExtension extension, Uri uri) {
        try {
            CamelContext context = selectContext(ip, instance, extension);
            FluentProducerTemplate producerTemplate = context.createFluentProducerTemplate();
            Endpoint endpoint = context.getEndpoint(uri.value(), Endpoint.class);
            producerTemplate.setDefaultEndpoint(endpoint);
            return producerTemplate;
        } catch (Exception cause) {
            throw new InjectionException(
                    "Error injecting fluent producer template annotated with " + uri + " into " + ip, cause);
        }
    }

    private static FluentProducerTemplate defaultFluentProducerTemplate(
            InjectionPoint ip, @Any Instance<CamelContext> instance, CdiCamelExtension extension) {
        try {
            CamelContext context = selectContext(ip, instance, extension);
            return context.createFluentProducerTemplate();
        } catch (Exception cause) {
            throw new InjectionException("Error injecting fluent producer template into " + ip, cause);
        }
    }

    @Uri("")
    @Produces
    // Qualifiers are dynamically added in CdiCamelExtension
    private static Endpoint endpoint(InjectionPoint ip, @Any Instance<CamelContext> instance, CdiCamelExtension extension) {
        Uri uri = getQualifierByType(ip, Uri.class).get();
        try {
            CamelContext context = selectContext(ip, instance, extension);
            return context.getEndpoint(uri.value(), Endpoint.class);
        } catch (Exception cause) {
            throw new InjectionException("Error injecting endpoint annotated with " + uri + " into " + ip, cause);
        }
    }

    @Produces
    @SuppressWarnings("unchecked")
    // Qualifiers are dynamically added in CdiCamelExtension
    private static <T> CdiEventEndpoint<T> cdiEventEndpoint(
            InjectionPoint ip, @Any Instance<CamelContext> instance, CdiCamelExtension extension, @Any Event<Object> event)
            throws Exception {
        CamelContext context = selectContext(ip, instance, extension);
        Type type = Object.class;
        if (ip.getType() instanceof ParameterizedType) {
            type = ((ParameterizedType) ip.getType()).getActualTypeArguments()[0];
        }
        String uri = eventEndpointUri(type, ip.getQualifiers());
        if (context.hasEndpoint(uri) == null) {
            context.addEndpoint(uri, extension.getEventEndpoint(uri));
        }
        return context.getEndpoint(uri, CdiEventEndpoint.class);
    }

    static CamelContext selectContext(InjectionPoint ip, Instance<CamelContext> instance, CdiCamelExtension extension) {
        Collection<Annotation> qualifiers = new HashSet<>(ip.getQualifiers());
        qualifiers.retainAll(extension.getContextQualifiers());
        if (qualifiers.isEmpty() && !instance.select(Default.Literal.INSTANCE).isUnsatisfied()) {
            return instance.select(Default.Literal.INSTANCE).get();
        }
        return instance.select(qualifiers.toArray(new Annotation[0])).get();
    }

    static <T extends Annotation> Optional<T> getQualifierByType(InjectionPoint ip, Class<T> type) {
        return ip.getQualifiers().stream()
                .filter(isAnnotationType(type))
                .findAny()
                .map(type::cast);
    }
}
