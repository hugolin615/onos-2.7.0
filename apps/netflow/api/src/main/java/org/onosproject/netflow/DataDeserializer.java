/*
 * Copyright 2023-present Open Networking Foundation
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

package org.onosproject.netflow;

import org.onlab.packet.IPacket;
import org.onlab.packet.DeserializationException;
@FunctionalInterface
public interface DataDeserializer<U extends IPacket> {

    /**
     * Deserialize a netflow data flowset packet object from a byte array.
     *
     * @param data     input array to take packet bytes from
     * @param offset   index where this packet header begins in the byte array
     * @param length   length of the packet header
     * @param template data template
     * @return a deserialized packet object
     * @throws DeserializationException if the packet cannot be deserialized
     *         from the input
     */
    U deserialize(byte[] data, int offset, int length, FlowRecord template) throws DeserializationException;
}
