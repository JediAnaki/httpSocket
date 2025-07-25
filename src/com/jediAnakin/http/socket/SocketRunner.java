package com.jediAnakin.http.socket;

import java.io.*;
import java.net.Inet4Address;
import java.net.Socket;
import java.util.Scanner;

public class SocketRunner {
    public static void main(String[] args) throws IOException {
        //http - 80
        //https - 443 под капотом использует SSL шифровку
        var byName = Inet4Address.getByName("localhost");
        try (var socket = new Socket(byName, 7777);
             var outputStream = new DataOutputStream(socket.getOutputStream());
             var inputStream = new DataInputStream(socket.getInputStream());
             var scanner = new Scanner(System.in)) {
            while (scanner.hasNextLine()) {
                var requestServer = scanner.nextLine();
                outputStream.writeUTF(requestServer);
                System.out.println("Response from server: " + inputStream.readUTF());
            }

        }

    }
}
