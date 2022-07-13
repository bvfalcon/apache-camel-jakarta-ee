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
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Manage ZooKeeper clusters.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface ZooKeeperEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the ZooKeeper component.
     */
    public interface ZooKeeperEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedZooKeeperEndpointConsumerBuilder advanced() {
            return (AdvancedZooKeeperEndpointConsumerBuilder) this;
        }
        /**
         * Whether the children of the node should be listed.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param listChildren the value to set
         * @return the dsl builder
         */
        default ZooKeeperEndpointConsumerBuilder listChildren(
                boolean listChildren) {
            doSetProperty("listChildren", listChildren);
            return this;
        }
        /**
         * Whether the children of the node should be listed.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: common
         * 
         * @param listChildren the value to set
         * @return the dsl builder
         */
        default ZooKeeperEndpointConsumerBuilder listChildren(
                String listChildren) {
            doSetProperty("listChildren", listChildren);
            return this;
        }
        /**
         * The time interval to wait on connection before timing out.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 5000
         * Group: common
         * 
         * @param timeout the value to set
         * @return the dsl builder
         */
        default ZooKeeperEndpointConsumerBuilder timeout(int timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * The time interval to wait on connection before timing out.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 5000
         * Group: common
         * 
         * @param timeout the value to set
         * @return the dsl builder
         */
        default ZooKeeperEndpointConsumerBuilder timeout(String timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * The time interval to backoff for after an error before retrying.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 5000
         * Group: consumer
         * 
         * @param backoff the value to set
         * @return the dsl builder
         */
        default ZooKeeperEndpointConsumerBuilder backoff(long backoff) {
            doSetProperty("backoff", backoff);
            return this;
        }
        /**
         * The time interval to backoff for after an error before retrying.
         * 
         * The option will be converted to a &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 5000
         * Group: consumer
         * 
         * @param backoff the value to set
         * @return the dsl builder
         */
        default ZooKeeperEndpointConsumerBuilder backoff(String backoff) {
            doSetProperty("backoff", backoff);
            return this;
        }
        /**
         * Should changes to the znode be 'watched' and repeatedly processed.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param repeat the value to set
         * @return the dsl builder
         */
        default ZooKeeperEndpointConsumerBuilder repeat(boolean repeat) {
            doSetProperty("repeat", repeat);
            return this;
        }
        /**
         * Should changes to the znode be 'watched' and repeatedly processed.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param repeat the value to set
         * @return the dsl builder
         */
        default ZooKeeperEndpointConsumerBuilder repeat(String repeat) {
            doSetProperty("repeat", repeat);
            return this;
        }
        /**
         * Upon the delete of a znode, should an empty message be send to the
         * consumer.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param sendEmptyMessageOnDelete the value to set
         * @return the dsl builder
         */
        default ZooKeeperEndpointConsumerBuilder sendEmptyMessageOnDelete(
                boolean sendEmptyMessageOnDelete) {
            doSetProperty("sendEmptyMessageOnDelete", sendEmptyMessageOnDelete);
            return this;
        }
        /**
         * Upon the delete of a znode, should an empty message be send to the
         * consumer.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param sendEmptyMessageOnDelete the value to set
         * @return the dsl builder
         */
        default ZooKeeperEndpointConsumerBuilder sendEmptyMessageOnDelete(
                String sendEmptyMessageOnDelete) {
            doSetProperty("sendEmptyMessageOnDelete", sendEmptyMessageOnDelete);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the ZooKeeper component.
     */
    public interface AdvancedZooKeeperEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default ZooKeeperEndpointConsumerBuilder basic() {
            return (ZooKeeperEndpointConsumerBuilder) this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedZooKeeperEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedZooKeeperEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedZooKeeperEndpointConsumerBuilder exceptionHandler(
                org.apache.camel.spi.ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedZooKeeperEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedZooKeeperEndpointConsumerBuilder exchangePattern(
                org.apache.camel.ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedZooKeeperEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the ZooKeeper component.
     */
    public interface ZooKeeperEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedZooKeeperEndpointProducerBuilder advanced() {
            return (AdvancedZooKeeperEndpointProducerBuilder) this;
        }
        /**
         * Whether the children of the node should be listed.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param listChildren the value to set
         * @return the dsl builder
         */
        default ZooKeeperEndpointProducerBuilder listChildren(
                boolean listChildren) {
            doSetProperty("listChildren", listChildren);
            return this;
        }
        /**
         * Whether the children of the node should be listed.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: common
         * 
         * @param listChildren the value to set
         * @return the dsl builder
         */
        default ZooKeeperEndpointProducerBuilder listChildren(
                String listChildren) {
            doSetProperty("listChildren", listChildren);
            return this;
        }
        /**
         * The time interval to wait on connection before timing out.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 5000
         * Group: common
         * 
         * @param timeout the value to set
         * @return the dsl builder
         */
        default ZooKeeperEndpointProducerBuilder timeout(int timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * The time interval to wait on connection before timing out.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 5000
         * Group: common
         * 
         * @param timeout the value to set
         * @return the dsl builder
         */
        default ZooKeeperEndpointProducerBuilder timeout(String timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * Should the endpoint create the node if it does not currently exist.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param create the value to set
         * @return the dsl builder
         */
        default ZooKeeperEndpointProducerBuilder create(boolean create) {
            doSetProperty("create", create);
            return this;
        }
        /**
         * Should the endpoint create the node if it does not currently exist.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param create the value to set
         * @return the dsl builder
         */
        default ZooKeeperEndpointProducerBuilder create(String create) {
            doSetProperty("create", create);
            return this;
        }
        /**
         * The create mode that should be used for the newly created node.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: EPHEMERAL
         * Group: producer
         * 
         * @param createMode the value to set
         * @return the dsl builder
         */
        default ZooKeeperEndpointProducerBuilder createMode(String createMode) {
            doSetProperty("createMode", createMode);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the ZooKeeper component.
     */
    public interface AdvancedZooKeeperEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default ZooKeeperEndpointProducerBuilder basic() {
            return (ZooKeeperEndpointProducerBuilder) this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedZooKeeperEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedZooKeeperEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Builder for endpoint for the ZooKeeper component.
     */
    public interface ZooKeeperEndpointBuilder
            extends
                ZooKeeperEndpointConsumerBuilder,
                ZooKeeperEndpointProducerBuilder {
        default AdvancedZooKeeperEndpointBuilder advanced() {
            return (AdvancedZooKeeperEndpointBuilder) this;
        }
        /**
         * Whether the children of the node should be listed.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param listChildren the value to set
         * @return the dsl builder
         */
        default ZooKeeperEndpointBuilder listChildren(boolean listChildren) {
            doSetProperty("listChildren", listChildren);
            return this;
        }
        /**
         * Whether the children of the node should be listed.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: common
         * 
         * @param listChildren the value to set
         * @return the dsl builder
         */
        default ZooKeeperEndpointBuilder listChildren(String listChildren) {
            doSetProperty("listChildren", listChildren);
            return this;
        }
        /**
         * The time interval to wait on connection before timing out.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 5000
         * Group: common
         * 
         * @param timeout the value to set
         * @return the dsl builder
         */
        default ZooKeeperEndpointBuilder timeout(int timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * The time interval to wait on connection before timing out.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 5000
         * Group: common
         * 
         * @param timeout the value to set
         * @return the dsl builder
         */
        default ZooKeeperEndpointBuilder timeout(String timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the ZooKeeper component.
     */
    public interface AdvancedZooKeeperEndpointBuilder
            extends
                AdvancedZooKeeperEndpointConsumerBuilder,
                AdvancedZooKeeperEndpointProducerBuilder {
        default ZooKeeperEndpointBuilder basic() {
            return (ZooKeeperEndpointBuilder) this;
        }
    }

    public interface ZooKeeperBuilders {
        /**
         * ZooKeeper (camel-zookeeper)
         * Manage ZooKeeper clusters.
         * 
         * Category: clustering,management,bigdata
         * Since: 2.9
         * Maven coordinates: org.apache.camel:camel-zookeeper
         * 
         * @return the dsl builder for the headers' name.
         */
        default ZooKeeperHeaderNameBuilder zookeeper() {
            return ZooKeeperHeaderNameBuilder.INSTANCE;
        }
        /**
         * ZooKeeper (camel-zookeeper)
         * Manage ZooKeeper clusters.
         * 
         * Category: clustering,management,bigdata
         * Since: 2.9
         * Maven coordinates: org.apache.camel:camel-zookeeper
         * 
         * Syntax: <code>zookeeper:serverUrls/path</code>
         * 
         * Path parameter: serverUrls (required)
         * The zookeeper server hosts (multiple servers can be separated by
         * comma)
         * 
         * Path parameter: path (required)
         * The node in the ZooKeeper server (aka znode)
         * 
         * @param path serverUrls/path
         * @return the dsl builder
         */
        default ZooKeeperEndpointBuilder zookeeper(String path) {
            return ZooKeeperEndpointBuilderFactory.endpointBuilder("zookeeper", path);
        }
        /**
         * ZooKeeper (camel-zookeeper)
         * Manage ZooKeeper clusters.
         * 
         * Category: clustering,management,bigdata
         * Since: 2.9
         * Maven coordinates: org.apache.camel:camel-zookeeper
         * 
         * Syntax: <code>zookeeper:serverUrls/path</code>
         * 
         * Path parameter: serverUrls (required)
         * The zookeeper server hosts (multiple servers can be separated by
         * comma)
         * 
         * Path parameter: path (required)
         * The node in the ZooKeeper server (aka znode)
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path serverUrls/path
         * @return the dsl builder
         */
        default ZooKeeperEndpointBuilder zookeeper(
                String componentName,
                String path) {
            return ZooKeeperEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the ZooKeeper component.
     */
    public static class ZooKeeperHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final ZooKeeperHeaderNameBuilder INSTANCE = new ZooKeeperHeaderNameBuilder();

        /**
         * The node.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: common
         * 
         * @return the name of the header {@code ZooKeeperNode}.
         */
        public String zooKeeperNode() {
            return "ZooKeeperNode";
        }

        /**
         * The node version.
         * 
         * The option is a: {@code Integer} type.
         * 
         * Default: -1
         * Group: common
         * 
         * @return the name of the header {@code ZooKeeperVersion}.
         */
        public String zooKeeperVersion() {
            return "ZooKeeperVersion";
        }

        /**
         * The ACL.
         * 
         * The option is a: {@code List<ACL>} type.
         * 
         * Default: Ids.OPEN_ACL_UNSAFE
         * Group: common
         * 
         * @return the name of the header {@code ZookeeperAcl}.
         */
        public String zookeeperAcl() {
            return "ZookeeperAcl";
        }

        /**
         * The create mode.
         * 
         * The option is a: {@code org.apache.zookeeper.CreateMode or String}
         * type.
         * 
         * Group: common
         * 
         * @return the name of the header {@code ZookeeperCreateMode}.
         */
        public String zookeeperCreateMode() {
            return "ZookeeperCreateMode";
        }

        /**
         * The statistics.
         * 
         * The option is a: {@code org.apache.zookeeper.data.Stat} type.
         * 
         * Group: common
         * 
         * @return the name of the header {@code ZookeeperStatistics}.
         */
        public String zookeeperStatistics() {
            return "ZookeeperStatistics";
        }

        /**
         * The event type.
         * 
         * The option is a: {@code org.apache.zookeeper.Watcher.Event.EventType}
         * type.
         * 
         * Group: common
         * 
         * @return the name of the header {@code ZookeeperEventType}.
         */
        public String zookeeperEventType() {
            return "ZookeeperEventType";
        }

        /**
         * The operation to perform.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code ZookeeperOperation}.
         */
        public String zookeeperOperation() {
            return "ZookeeperOperation";
        }
    }
    static ZooKeeperEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class ZooKeeperEndpointBuilderImpl extends AbstractEndpointBuilder implements ZooKeeperEndpointBuilder, AdvancedZooKeeperEndpointBuilder {
            public ZooKeeperEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new ZooKeeperEndpointBuilderImpl(path);
    }
}