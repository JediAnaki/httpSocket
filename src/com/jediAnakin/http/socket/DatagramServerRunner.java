package com.jediAnakin.http.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DatagramServerRunner {
    public static void main(String[] args) throws IOException {
        try (var datagramServer = new DatagramSocket(7777)) {
            byte[] buffer = new byte[512];
            DatagramPacket pocket = new DatagramPacket(buffer, buffer.length);
            datagramServer.receive(pocket);

            System.out.println(new String(buffer));

        }
    }
}
