package com.svg.java.designpatterns.creational.abstract_factory.example1;

public class FCBarcelonaFactory extends EquipmentAbstractFactory {

    public FootballShirt getFootballShirt(){
        return new FCBarcelonaShirt();
    }

    public FootballPants getFootballPants(){
        return new FCBarcelonaPants();
    }
}
