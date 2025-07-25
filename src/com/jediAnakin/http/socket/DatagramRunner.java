package com.jediAnakin.http.socket;

import java.io.IOException;
import java.net.*;

public class DatagramRunner {

    public static void main(String[] args) throws IOException {
        var byName = InetAddress.getByName("localhost");
        try (var datagramSocket = new DatagramSocket()) {
            var bytes = "Hello from UDP client".getBytes();
            DatagramPacket pocket = new DatagramPacket(bytes, bytes.length, byName, 7777);
            datagramSocket.send(pocket);
        }

    }
}
