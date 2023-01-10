package com.svg.java.designpatterns.creational.abstract_factory.example1;

public class GironaFCFactory extends EquipmentAbstractFactory {
    @Override
    public FootballShirt getFootballShirt() {
        return new GironaFCShirt();
    }

    @Override
    public FootballPants getFootballPants() {
        return new GironaFCPants();
    }
}
