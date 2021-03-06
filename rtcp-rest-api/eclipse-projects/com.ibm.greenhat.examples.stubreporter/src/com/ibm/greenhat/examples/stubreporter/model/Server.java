/**
 * Copyright 2014 IBM Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ibm.greenhat.examples.stubreporter.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a whole Server
 */
public class Server {

    private final String url;
    private final List<Domain> domains;

    public Server(final String url) {
        this.url = url;
        domains = new ArrayList<Domain>();
    }

    public String getUrl() {
        return url;
    }

    public List<Domain> getDomains() {
        return domains;
    }

    public Domain addDomain(final Domain domain) {
        final int indexOf = domains.indexOf(domain);
        if (indexOf != -1) {
            return domains.get(indexOf);
        }
        domains.add(domain);
        return domain;
    }
}
