package com.svg.java.designpatterns.creational.singleton.example1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration {

    private static Properties properties;
    private static Configuration configuration;

    private Configuration() throws IOException {
        properties = new Properties();
        properties.load(new FileInputStream("properties.yml"));
    }

    public static String getProperty(String name) {
        return properties.getProperty(name);
    }

    public static Configuration getInstance() throws IOException {
        if (configuration == null )
            configuration = new Configuration();

        return configuration;
    }

}
