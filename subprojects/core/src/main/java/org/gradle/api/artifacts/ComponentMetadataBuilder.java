/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.api.artifacts;

import org.gradle.api.Incubating;

import java.util.List;

/**
 * A component metadata builder.
 *
 * @since 3.6
 */
@Incubating
public interface ComponentMetadataBuilder {
    /**
     * Sets the changing flag of this component
     * @param changing true if the component represents a changing component
     */
    void setChanging(boolean changing);

    /**
     * Sets the status of this component
     * @param status the component status
     */
    void setStatus(String status);

    /**
     * Sets the status scheme of this component
     * @param scheme the status scheme
     */
    void setStatusScheme(List<String> scheme);
}
