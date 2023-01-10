package com.svg.java.designpatterns.creational.abstract_factory.example1;

public class FootballPantsFactory {

    public static FootballPants getInstance(FootballClubs footballClubs) {

        if (footballClubs.equals("Girona_FC")) {
            return new GironaFCPants();
        } else {
            return new FCBarcelonaPants();
        }
    }
}
