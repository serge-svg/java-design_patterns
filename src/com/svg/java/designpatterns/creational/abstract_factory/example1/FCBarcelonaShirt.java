package com.svg.java.designpatterns.creational.abstract_factory.example1;

import lombok.Data;

@Data
public class FCBarcelonaShirt extends FootballShirt{

    private String name;
    private int number;

    @Override
    public void print() {
        System.out.println("FC Barcelona");
        System.out.println(name);
        System.out.println(number);
    }
}
