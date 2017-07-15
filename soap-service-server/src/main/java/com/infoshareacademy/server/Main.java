package com.infoshareacademy.server;

import com.infoshareacademy.server.com.infoshareacademy.server.AcademyServiceImpl;
import javax.xml.ws.Endpoint;

public class Main {

    public static void main(String[] args) {

        Endpoint.publish("http://localhost:9990/service",
            new AcademyServiceImpl());

        System.out.println("Server started...");
    }
}
