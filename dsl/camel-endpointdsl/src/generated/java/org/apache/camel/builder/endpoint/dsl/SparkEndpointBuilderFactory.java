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
import jakarta.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Send RDD or DataFrame jobs to Apache Spark clusters.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface SparkEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Spark component.
     */
    public interface SparkEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedSparkEndpointBuilder advanced() {
            return (AdvancedSparkEndpointBuilder) this;
        }
        /**
         * Indicates if results should be collected or counted.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param collect the value to set
         * @return the dsl builder
         */
        default SparkEndpointBuilder collect(boolean collect) {
            doSetProperty("collect", collect);
            return this;
        }
        /**
         * Indicates if results should be collected or counted.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param collect the value to set
         * @return the dsl builder
         */
        default SparkEndpointBuilder collect(String collect) {
            doSetProperty("collect", collect);
            return this;
        }
        /**
         * DataFrame to compute against.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.spark.sql.Dataset&amp;lt;org.apache.spark.sql.Row&amp;gt;&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param dataFrame the value to set
         * @return the dsl builder
         */
        default SparkEndpointBuilder dataFrame(
                org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> dataFrame) {
            doSetProperty("dataFrame", dataFrame);
            return this;
        }
        /**
         * DataFrame to compute against.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.spark.sql.Dataset&amp;lt;org.apache.spark.sql.Row&amp;gt;&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param dataFrame the value to set
         * @return the dsl builder
         */
        default SparkEndpointBuilder dataFrame(String dataFrame) {
            doSetProperty("dataFrame", dataFrame);
            return this;
        }
        /**
         * Function performing action against an DataFrame.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.spark.DataFrameCallback&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param dataFrameCallback the value to set
         * @return the dsl builder
         */
        default SparkEndpointBuilder dataFrameCallback(
                org.apache.camel.component.spark.DataFrameCallback dataFrameCallback) {
            doSetProperty("dataFrameCallback", dataFrameCallback);
            return this;
        }
        /**
         * Function performing action against an DataFrame.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.spark.DataFrameCallback&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param dataFrameCallback the value to set
         * @return the dsl builder
         */
        default SparkEndpointBuilder dataFrameCallback(String dataFrameCallback) {
            doSetProperty("dataFrameCallback", dataFrameCallback);
            return this;
        }
        /**
         * RDD to compute against.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.spark.api.java.JavaRDDLike&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param rdd the value to set
         * @return the dsl builder
         */
        default SparkEndpointBuilder rdd(
                org.apache.spark.api.java.JavaRDDLike rdd) {
            doSetProperty("rdd", rdd);
            return this;
        }
        /**
         * RDD to compute against.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.spark.api.java.JavaRDDLike&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param rdd the value to set
         * @return the dsl builder
         */
        default SparkEndpointBuilder rdd(String rdd) {
            doSetProperty("rdd", rdd);
            return this;
        }
        /**
         * Function performing action against an RDD.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.spark.RddCallback&lt;/code&gt;
         * type.
         * 
         * Group: producer
         * 
         * @param rddCallback the value to set
         * @return the dsl builder
         */
        default SparkEndpointBuilder rddCallback(
                org.apache.camel.component.spark.RddCallback rddCallback) {
            doSetProperty("rddCallback", rddCallback);
            return this;
        }
        /**
         * Function performing action against an RDD.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.spark.RddCallback&lt;/code&gt;
         * type.
         * 
         * Group: producer
         * 
         * @param rddCallback the value to set
         * @return the dsl builder
         */
        default SparkEndpointBuilder rddCallback(String rddCallback) {
            doSetProperty("rddCallback", rddCallback);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Spark component.
     */
    public interface AdvancedSparkEndpointBuilder
            extends
                EndpointProducerBuilder {
        default SparkEndpointBuilder basic() {
            return (SparkEndpointBuilder) this;
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
        default AdvancedSparkEndpointBuilder lazyStartProducer(
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
        default AdvancedSparkEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    public interface SparkBuilders {
        /**
         * Spark (camel-spark)
         * Send RDD or DataFrame jobs to Apache Spark clusters.
         * 
         * Category: bigdata,iot
         * Since: 2.17
         * Maven coordinates: org.apache.camel:camel-spark
         * 
         * @return the dsl builder for the headers' name.
         */
        default SparkHeaderNameBuilder spark() {
            return SparkHeaderNameBuilder.INSTANCE;
        }
        /**
         * Spark (camel-spark)
         * Send RDD or DataFrame jobs to Apache Spark clusters.
         * 
         * Category: bigdata,iot
         * Since: 2.17
         * Maven coordinates: org.apache.camel:camel-spark
         * 
         * Syntax: <code>spark:endpointType</code>
         * 
         * Path parameter: endpointType (required)
         * Type of the endpoint (rdd, dataframe, hive).
         * There are 3 enums and the value can be one of: rdd, dataframe, hive
         * 
         * @param path endpointType
         * @return the dsl builder
         */
        @Deprecated
        default SparkEndpointBuilder spark(String path) {
            return SparkEndpointBuilderFactory.endpointBuilder("spark", path);
        }
        /**
         * Spark (camel-spark)
         * Send RDD or DataFrame jobs to Apache Spark clusters.
         * 
         * Category: bigdata,iot
         * Since: 2.17
         * Maven coordinates: org.apache.camel:camel-spark
         * 
         * Syntax: <code>spark:endpointType</code>
         * 
         * Path parameter: endpointType (required)
         * Type of the endpoint (rdd, dataframe, hive).
         * There are 3 enums and the value can be one of: rdd, dataframe, hive
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path endpointType
         * @return the dsl builder
         */
        @Deprecated
        default SparkEndpointBuilder spark(String componentName, String path) {
            return SparkEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the Spark component.
     */
    public static class SparkHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final SparkHeaderNameBuilder INSTANCE = new SparkHeaderNameBuilder();

        /**
         * The RDD.
         * 
         * The option is a: {@code Object} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code _SPARK_RDD}.
         */
        public String sparkRdd() {
            return "_SPARK_RDD";
        }

        /**
         * The function performing action against an RDD.
         * 
         * The option is a: {@code org.apache.camel.component.spark.RddCallback}
         * type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code _SPARK_RDD_CALLBACK}.
         */
        public String sparkRddCallback() {
            return "_SPARK_RDD_CALLBACK";
        }

        /**
         * The data frame to compute against.
         * 
         * The option is a: {@code Dataset<Row>} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code _SPARK_DATAFRAME}.
         */
        public String sparkDataframe() {
            return "_SPARK_DATAFRAME";
        }

        /**
         * The function performing action against a data frame.
         * 
         * The option is a: {@code
         * org.apache.camel.component.spark.DataFrameCallback} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code _SPARK_DATAFRAME_CALLBACK}.
         */
        public String sparkDataframeCallback() {
            return "_SPARK_DATAFRAME_CALLBACK";
        }
    }
    @Deprecated
    static SparkEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class SparkEndpointBuilderImpl extends AbstractEndpointBuilder implements SparkEndpointBuilder, AdvancedSparkEndpointBuilder {
            public SparkEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new SparkEndpointBuilderImpl(path);
    }
}