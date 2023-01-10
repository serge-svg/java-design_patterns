package com.svg.java.designpatterns.creational.abstract_factory.example1;

import lombok.Data;

@Data
public class GironaFCShirt extends FootballShirt{

    @Override
    public void print() {
        System.out.println("Girona FC");
        System.out.println(getName());
        System.out.println(getNumber());
    }
}
