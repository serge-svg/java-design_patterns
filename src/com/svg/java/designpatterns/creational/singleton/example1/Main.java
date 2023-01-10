package com.svg.java.designpatterns.creational.singleton.example1;

import java.io.IOException;

public class Main {

    public static void main(String[] args)  {

        try {
            Configuration configuration1 = Configuration.getInstance();
            System.out.println(configuration1.getProperty("db.name"));
            System.out.println(configuration1.getProperty("db.username"));

            // Checking that the singleton pattern is working,
            // usually is just need a single instance of the Properties object
            // due the values should be the same in the whole application.
            Configuration configuration2 = Configuration.getInstance();
            System.out.println(configuration2.getProperty("db.name"));
            System.out.println(configuration2.getProperty("db.username"));

        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }
}
