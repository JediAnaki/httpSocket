package com.jediAnakin.http.client;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class UrlExample {
    public static void main(String[] args) throws IOException {
        var url = new URL("file:/Users/dina.kich/IdeaProjects/httpSocket/src/com/jediAnakin/http/socket/DatagramRunner.java");
        var urlConnection = url.openConnection();
        System.out.println(new String(urlConnection.getInputStream().readAllBytes()));
    }

    private static void checkGoogle() throws IOException {
        var url = new URL("https://www.google.com");
        var urlConnection = url.openConnection();
        urlConnection.setDoOutput(true);

        try (var outputStream = urlConnection.getOutputStream()) {

        }

        System.out.println();
    }
}
