package com.svg.java.designpatterns.creational.abstract_factory.example1;

import lombok.Data;

@Data
public class FCBarcelonaPants extends FootballPants{

    @Override
    public void print() {
        System.out.println("FC Barcelona");
        System.out.println(getNumber());
    }
}
