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
package org.apache.camel.model.rest;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import org.apache.camel.spi.Metadata;

/**
 * Rest security definition
 */
@Metadata(label = "rest,security,configuration", title = "Rest Security")
@XmlRootElement(name = "security")
@XmlAccessorType(XmlAccessType.FIELD)
public class SecurityDefinition {

    @XmlAttribute(required = true)
    @Metadata(required = true)
    private String key;
    @XmlAttribute
    private String scopes;

    public String getKey() {
        return key;
    }

    /**
     * Key used to refer to this security definition
     */
    public void setKey(String key) {
        this.key = key;
    }

    public String getScopes() {
        return scopes;
    }

    /**
     * The scopes to allow (separate multiple scopes by comma)
     */
    public void setScopes(String scopes) {
        this.scopes = scopes;
    }
}
