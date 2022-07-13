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
import java.util.Map;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Schedule sending of messages using the Quartz 2.x scheduler.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface QuartzEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Quartz component.
     */
    public interface QuartzEndpointBuilder extends EndpointConsumerBuilder {
        default AdvancedQuartzEndpointBuilder advanced() {
            return (AdvancedQuartzEndpointBuilder) this;
        }
        /**
         * Specifies a cron expression to define when to trigger.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param cron the value to set
         * @return the dsl builder
         */
        default QuartzEndpointBuilder cron(String cron) {
            doSetProperty("cron", cron);
            return this;
        }
        /**
         * If set to true, then the trigger automatically delete when route
         * stop. Else if set to false, it will remain in scheduler. When set to
         * false, it will also mean user may reuse pre-configured trigger with
         * camel Uri. Just ensure the names match. Notice you cannot have both
         * deleteJob and pauseJob set to true.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param deleteJob the value to set
         * @return the dsl builder
         */
        default QuartzEndpointBuilder deleteJob(boolean deleteJob) {
            doSetProperty("deleteJob", deleteJob);
            return this;
        }
        /**
         * If set to true, then the trigger automatically delete when route
         * stop. Else if set to false, it will remain in scheduler. When set to
         * false, it will also mean user may reuse pre-configured trigger with
         * camel Uri. Just ensure the names match. Notice you cannot have both
         * deleteJob and pauseJob set to true.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param deleteJob the value to set
         * @return the dsl builder
         */
        default QuartzEndpointBuilder deleteJob(String deleteJob) {
            doSetProperty("deleteJob", deleteJob);
            return this;
        }
        /**
         * Whether or not the job should remain stored after it is orphaned (no
         * triggers point to it).
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param durableJob the value to set
         * @return the dsl builder
         */
        default QuartzEndpointBuilder durableJob(boolean durableJob) {
            doSetProperty("durableJob", durableJob);
            return this;
        }
        /**
         * Whether or not the job should remain stored after it is orphaned (no
         * triggers point to it).
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param durableJob the value to set
         * @return the dsl builder
         */
        default QuartzEndpointBuilder durableJob(String durableJob) {
            doSetProperty("durableJob", durableJob);
            return this;
        }
        /**
         * If set to true, then the trigger automatically pauses when route
         * stop. Else if set to false, it will remain in scheduler. When set to
         * false, it will also mean user may reuse pre-configured trigger with
         * camel Uri. Just ensure the names match. Notice you cannot have both
         * deleteJob and pauseJob set to true.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param pauseJob the value to set
         * @return the dsl builder
         */
        default QuartzEndpointBuilder pauseJob(boolean pauseJob) {
            doSetProperty("pauseJob", pauseJob);
            return this;
        }
        /**
         * If set to true, then the trigger automatically pauses when route
         * stop. Else if set to false, it will remain in scheduler. When set to
         * false, it will also mean user may reuse pre-configured trigger with
         * camel Uri. Just ensure the names match. Notice you cannot have both
         * deleteJob and pauseJob set to true.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param pauseJob the value to set
         * @return the dsl builder
         */
        default QuartzEndpointBuilder pauseJob(String pauseJob) {
            doSetProperty("pauseJob", pauseJob);
            return this;
        }
        /**
         * Instructs the scheduler whether or not the job should be re-executed
         * if a 'recovery' or 'fail-over' situation is encountered.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param recoverableJob the value to set
         * @return the dsl builder
         */
        default QuartzEndpointBuilder recoverableJob(boolean recoverableJob) {
            doSetProperty("recoverableJob", recoverableJob);
            return this;
        }
        /**
         * Instructs the scheduler whether or not the job should be re-executed
         * if a 'recovery' or 'fail-over' situation is encountered.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param recoverableJob the value to set
         * @return the dsl builder
         */
        default QuartzEndpointBuilder recoverableJob(String recoverableJob) {
            doSetProperty("recoverableJob", recoverableJob);
            return this;
        }
        /**
         * Uses a Quartz PersistJobDataAfterExecution and
         * DisallowConcurrentExecution instead of the default job.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param stateful the value to set
         * @return the dsl builder
         */
        default QuartzEndpointBuilder stateful(boolean stateful) {
            doSetProperty("stateful", stateful);
            return this;
        }
        /**
         * Uses a Quartz PersistJobDataAfterExecution and
         * DisallowConcurrentExecution instead of the default job.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param stateful the value to set
         * @return the dsl builder
         */
        default QuartzEndpointBuilder stateful(String stateful) {
            doSetProperty("stateful", stateful);
            return this;
        }
        /**
         * Whether or not the scheduler should be auto started.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: scheduler
         * 
         * @param autoStartScheduler the value to set
         * @return the dsl builder
         */
        default QuartzEndpointBuilder autoStartScheduler(
                boolean autoStartScheduler) {
            doSetProperty("autoStartScheduler", autoStartScheduler);
            return this;
        }
        /**
         * Whether or not the scheduler should be auto started.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: scheduler
         * 
         * @param autoStartScheduler the value to set
         * @return the dsl builder
         */
        default QuartzEndpointBuilder autoStartScheduler(
                String autoStartScheduler) {
            doSetProperty("autoStartScheduler", autoStartScheduler);
            return this;
        }
        /**
         * In case of scheduler has already started, we want the trigger start
         * slightly after current time to ensure endpoint is fully started
         * before the job kicks in. Negative value shifts trigger start time in
         * the past.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 500
         * Group: scheduler
         * 
         * @param triggerStartDelay the value to set
         * @return the dsl builder
         */
        default QuartzEndpointBuilder triggerStartDelay(long triggerStartDelay) {
            doSetProperty("triggerStartDelay", triggerStartDelay);
            return this;
        }
        /**
         * In case of scheduler has already started, we want the trigger start
         * slightly after current time to ensure endpoint is fully started
         * before the job kicks in. Negative value shifts trigger start time in
         * the past.
         * 
         * The option will be converted to a &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 500
         * Group: scheduler
         * 
         * @param triggerStartDelay the value to set
         * @return the dsl builder
         */
        default QuartzEndpointBuilder triggerStartDelay(String triggerStartDelay) {
            doSetProperty("triggerStartDelay", triggerStartDelay);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Quartz component.
     */
    public interface AdvancedQuartzEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default QuartzEndpointBuilder basic() {
            return (QuartzEndpointBuilder) this;
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
        default AdvancedQuartzEndpointBuilder bridgeErrorHandler(
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
        default AdvancedQuartzEndpointBuilder bridgeErrorHandler(
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
        default AdvancedQuartzEndpointBuilder exceptionHandler(
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
        default AdvancedQuartzEndpointBuilder exceptionHandler(
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
        default AdvancedQuartzEndpointBuilder exchangePattern(
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
        default AdvancedQuartzEndpointBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Specifies a custom calendar to avoid specific range of date.
         * 
         * The option is a: &lt;code&gt;org.quartz.Calendar&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param customCalendar the value to set
         * @return the dsl builder
         */
        default AdvancedQuartzEndpointBuilder customCalendar(
                org.quartz.Calendar customCalendar) {
            doSetProperty("customCalendar", customCalendar);
            return this;
        }
        /**
         * Specifies a custom calendar to avoid specific range of date.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.quartz.Calendar&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param customCalendar the value to set
         * @return the dsl builder
         */
        default AdvancedQuartzEndpointBuilder customCalendar(
                String customCalendar) {
            doSetProperty("customCalendar", customCalendar);
            return this;
        }
        /**
         * To configure additional options on the job.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * The option is multivalued, and you can use the jobParameters(String,
         * Object) method to add a value (call the method multiple times to set
         * more values).
         * 
         * Group: advanced
         * 
         * @param key the option key
         * @param value the option value
         * @return the dsl builder
         */
        default AdvancedQuartzEndpointBuilder jobParameters(
                String key,
                Object value) {
            doSetMultiValueProperty("jobParameters", "job." + key, value);
            return this;
        }
        /**
         * To configure additional options on the job.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * The option is multivalued, and you can use the jobParameters(String,
         * Object) method to add a value (call the method multiple times to set
         * more values).
         * 
         * Group: advanced
         * 
         * @param values the values
         * @return the dsl builder
         */
        default AdvancedQuartzEndpointBuilder jobParameters(Map values) {
            doSetMultiValueProperties("jobParameters", "job.", values);
            return this;
        }
        /**
         * Whether the job name should be prefixed with endpoint id.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param prefixJobNameWithEndpointId the value to set
         * @return the dsl builder
         */
        default AdvancedQuartzEndpointBuilder prefixJobNameWithEndpointId(
                boolean prefixJobNameWithEndpointId) {
            doSetProperty("prefixJobNameWithEndpointId", prefixJobNameWithEndpointId);
            return this;
        }
        /**
         * Whether the job name should be prefixed with endpoint id.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param prefixJobNameWithEndpointId the value to set
         * @return the dsl builder
         */
        default AdvancedQuartzEndpointBuilder prefixJobNameWithEndpointId(
                String prefixJobNameWithEndpointId) {
            doSetProperty("prefixJobNameWithEndpointId", prefixJobNameWithEndpointId);
            return this;
        }
        /**
         * To configure additional options on the trigger. The parameter
         * timeZone is supported if the cron option is present. Otherwise the
         * parameters repeatInterval and repeatCount are supported. Note: When
         * using repeatInterval values of 1000 or less, the first few events
         * after starting the camel context may be fired more rapidly than
         * expected.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * The option is multivalued, and you can use the
         * triggerParameters(String, Object) method to add a value (call the
         * method multiple times to set more values).
         * 
         * Group: advanced
         * 
         * @param key the option key
         * @param value the option value
         * @return the dsl builder
         */
        default AdvancedQuartzEndpointBuilder triggerParameters(
                String key,
                Object value) {
            doSetMultiValueProperty("triggerParameters", "trigger." + key, value);
            return this;
        }
        /**
         * To configure additional options on the trigger. The parameter
         * timeZone is supported if the cron option is present. Otherwise the
         * parameters repeatInterval and repeatCount are supported. Note: When
         * using repeatInterval values of 1000 or less, the first few events
         * after starting the camel context may be fired more rapidly than
         * expected.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * The option is multivalued, and you can use the
         * triggerParameters(String, Object) method to add a value (call the
         * method multiple times to set more values).
         * 
         * Group: advanced
         * 
         * @param values the values
         * @return the dsl builder
         */
        default AdvancedQuartzEndpointBuilder triggerParameters(Map values) {
            doSetMultiValueProperties("triggerParameters", "trigger.", values);
            return this;
        }
        /**
         * If it is true, JobDataMap uses the CamelContext name directly to
         * reference the CamelContext, if it is false, JobDataMap uses use the
         * CamelContext management name which could be changed during the deploy
         * time.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param usingFixedCamelContextName the value to set
         * @return the dsl builder
         */
        default AdvancedQuartzEndpointBuilder usingFixedCamelContextName(
                boolean usingFixedCamelContextName) {
            doSetProperty("usingFixedCamelContextName", usingFixedCamelContextName);
            return this;
        }
        /**
         * If it is true, JobDataMap uses the CamelContext name directly to
         * reference the CamelContext, if it is false, JobDataMap uses use the
         * CamelContext management name which could be changed during the deploy
         * time.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param usingFixedCamelContextName the value to set
         * @return the dsl builder
         */
        default AdvancedQuartzEndpointBuilder usingFixedCamelContextName(
                String usingFixedCamelContextName) {
            doSetProperty("usingFixedCamelContextName", usingFixedCamelContextName);
            return this;
        }
    }

    public interface QuartzBuilders {
        /**
         * Quartz (camel-quartz)
         * Schedule sending of messages using the Quartz 2.x scheduler.
         * 
         * Category: scheduling
         * Since: 2.12
         * Maven coordinates: org.apache.camel:camel-quartz
         * 
         * Syntax: <code>quartz:groupName/triggerName</code>
         * 
         * Path parameter: groupName
         * The quartz group name to use. The combination of group name and
         * trigger name should be unique.
         * Default value: Camel
         * 
         * Path parameter: triggerName (required)
         * The quartz trigger name to use. The combination of group name and
         * trigger name should be unique.
         * 
         * @param path groupName/triggerName
         * @return the dsl builder
         */
        default QuartzEndpointBuilder quartz(String path) {
            return QuartzEndpointBuilderFactory.endpointBuilder("quartz", path);
        }
        /**
         * Quartz (camel-quartz)
         * Schedule sending of messages using the Quartz 2.x scheduler.
         * 
         * Category: scheduling
         * Since: 2.12
         * Maven coordinates: org.apache.camel:camel-quartz
         * 
         * Syntax: <code>quartz:groupName/triggerName</code>
         * 
         * Path parameter: groupName
         * The quartz group name to use. The combination of group name and
         * trigger name should be unique.
         * Default value: Camel
         * 
         * Path parameter: triggerName (required)
         * The quartz trigger name to use. The combination of group name and
         * trigger name should be unique.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path groupName/triggerName
         * @return the dsl builder
         */
        default QuartzEndpointBuilder quartz(String componentName, String path) {
            return QuartzEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static QuartzEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class QuartzEndpointBuilderImpl extends AbstractEndpointBuilder implements QuartzEndpointBuilder, AdvancedQuartzEndpointBuilder {
            public QuartzEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new QuartzEndpointBuilderImpl(path);
    }
}