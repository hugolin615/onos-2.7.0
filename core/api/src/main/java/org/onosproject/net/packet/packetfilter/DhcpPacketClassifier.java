/*
 * Copyright 2019-present Open Networking Foundation
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
package org.onosproject.net.packet.packetfilter;

import org.onlab.packet.DHCP;
import org.onlab.packet.Ethernet;
import org.onlab.packet.IPv4;
import org.onlab.packet.UDP;
import org.onosproject.net.packet.PacketContext;
import org.onosproject.net.packet.PacketInClassifier;

public class DhcpPacketClassifier implements PacketInClassifier {

    @Override
    public boolean match(PacketContext packet) {

        Ethernet eth = packet.inPacket().parsed();

        if (eth.getEtherType() == Ethernet.TYPE_IPV4) {
            IPv4 ipv4Packet = (IPv4) eth.getPayload();

            if (ipv4Packet.getProtocol() == IPv4.PROTOCOL_UDP) {
                UDP udpPacket = (UDP) ipv4Packet.getPayload();

                if (udpPacket.getDestinationPort() == UDP.DHCP_SERVER_PORT &&
                        udpPacket.getSourcePort() == UDP.DHCP_CLIENT_PORT) {
                    DHCP dhcp = (DHCP) udpPacket.getPayload();
                    if (dhcp.getPacketType() == DHCP.MsgType.DHCPDISCOVER) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


}
