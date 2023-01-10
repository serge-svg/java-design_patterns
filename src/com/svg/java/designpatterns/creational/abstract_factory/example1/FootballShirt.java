package com.svg.java.designpatterns.creational.abstract_factory.example1;

import lombok.Data;

@Data
public abstract class FootballShirt {

    private String name;
    private int number;

    public abstract void print();
}
