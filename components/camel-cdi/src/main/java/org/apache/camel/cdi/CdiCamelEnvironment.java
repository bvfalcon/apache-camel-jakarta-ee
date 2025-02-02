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

import jakarta.enterprise.inject.spi.Annotated;
import jakarta.enterprise.inject.spi.BeanManager;
import jakarta.enterprise.inject.spi.InjectionTarget;
import jakarta.enterprise.inject.spi.Producer;
import org.apache.camel.CamelContext;

@Vetoed
final class CdiCamelEnvironment {

    <T extends CamelContext> Producer<T> camelContextProducer(
            Producer<T> delegate, Annotated annotated, BeanManager manager, CdiCamelExtension extension) {
        return new CamelContextProducer<>(delegate, annotated, manager, extension);
    }

    <T extends CamelContext> InjectionTarget<T> camelContextInjectionTarget(
            InjectionTarget<T> delegate, Annotated annotated, BeanManager manager, CdiCamelExtension extension) {
        CamelContextProducer<T> producer = new CamelContextProducer<>(delegate, annotated, manager, extension);
        return new CamelContextInjectionTarget<>(delegate, producer);
    }

}
