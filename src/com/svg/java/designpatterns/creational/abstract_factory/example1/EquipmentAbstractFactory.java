package com.svg.java.designpatterns.creational.abstract_factory.example1;

public abstract class EquipmentAbstractFactory {
    public abstract FootballShirt getFootballShirt();
    public abstract FootballPants getFootballPants();

    public static EquipmentAbstractFactory getInstance(FootballClubs footballClubs) {
        if (footballClubs.equals(FootballClubs.FC_Barcelona)){
            return new FCBarcelonaFactory();
        } else {
            return new GironaFCFactory();
        }
    }
}
