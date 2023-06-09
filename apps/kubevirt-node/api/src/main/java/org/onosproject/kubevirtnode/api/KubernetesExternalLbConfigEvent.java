/*
 * Copyright 2022-present Open Networking Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onosproject.kubevirtnode.api;

import org.onosproject.event.AbstractEvent;

public class KubernetesExternalLbConfigEvent
        extends AbstractEvent<KubernetesExternalLbConfigEvent.Type, KubernetesExternalLbConfig> {

    public KubernetesExternalLbConfigEvent(Type type, KubernetesExternalLbConfig subject) {
        super(type, subject);
    }

    /**
     * Kubernetes external lb config events.
     */
    public enum Type {
        /**
         * Signifies that a new config is created.
         */
        KUBERNETES_EXTERNAL_LB_CONFIG_CREATED,

        /**
         * Signifies that a new config is updated.
         */
        KUBERNETES_EXTERNAL_LB_CONFIG_UPDATED,

        /**
         * Signifies that a new config is removed.
         */
        KUBERNETES_EXTERNAL_LB_CONFIG_REMOVED
    }
}
