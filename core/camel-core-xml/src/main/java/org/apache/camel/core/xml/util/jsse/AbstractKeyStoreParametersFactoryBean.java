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
package org.apache.camel.core.xml.util.jsse;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlTransient;
import org.apache.camel.spi.Metadata;
import org.apache.camel.support.jsse.KeyStoreParameters;

@XmlAccessorType(XmlAccessType.FIELD)
public abstract class AbstractKeyStoreParametersFactoryBean extends AbstractJsseUtilFactoryBean<KeyStoreParameters> {

    @XmlAttribute
    @Metadata(description = "The optional type of the key store to load."
                            + " See Appendix A in the Java Cryptography Architecture Standard Algorithm Name Documentation for more information on standard names.")
    protected String type;

    @XmlAttribute
    @Metadata(description = "The optional password for reading/opening/verifying the key store")
    protected String password;

    @XmlAttribute
    @Metadata(description = "The optional provider identifier for instantiating the key store")
    protected String provider;

    @XmlAttribute
    @Metadata(description = "The optional file path, class path resource, or URL of the resource used to load the key store")
    protected String resource;

    @XmlTransient
    private KeyStoreParameters instance;

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String value) {
        this.password = value;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String value) {
        this.provider = value;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String value) {
        this.resource = value;
    }

    @Override
    public KeyStoreParameters getObject() throws Exception {
        if (this.isSingleton()) {
            if (instance == null) {
                instance = createInstance();
            }
            return instance;
        } else {
            return createInstance();
        }
    }

    protected KeyStoreParameters createInstance() {
        KeyStoreParameters newInstance = new KeyStoreParameters();

        newInstance.setPassword(this.password);
        newInstance.setProvider(this.provider);
        newInstance.setResource(this.resource);
        newInstance.setType(this.type);
        newInstance.setCamelContext(getCamelContext());

        return newInstance;
    }

    @Override
    public Class<? extends KeyStoreParameters> getObjectType() {
        return KeyStoreParameters.class;
    }

}
