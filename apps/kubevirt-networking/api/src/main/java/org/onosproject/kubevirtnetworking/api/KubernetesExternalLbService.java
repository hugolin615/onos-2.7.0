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
package org.onosproject.kubevirtnetworking.api;

import org.onosproject.event.ListenerService;

import java.util.Set;

public interface KubernetesExternalLbService
    extends ListenerService<KubernetesExternalLbEvent, KubernetesExternalLbListener> {

    /**
     * Returns the kubernetes external load balancer with the supplied service name.
     *
     * @param serviceName service name
     * @return kubernetes external load balancer
     */
    KubernetesExternalLb loadBalancer(String serviceName);

    /**
     * Returns all kubernetes external load balancers registered in the service.
     *
     * @return set of kubernetes external load balancers
     */
    Set<KubernetesExternalLb> loadBalancers();
}
