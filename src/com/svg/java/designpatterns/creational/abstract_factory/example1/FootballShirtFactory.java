package com.svg.java.designpatterns.creational.abstract_factory.example1;

public class FootballShirtFactory {

    public static FootballShirt getInstance(FootballClubs footballClubs) {

        if (footballClubs.equals("Girona_FC")) {
            return new GironaFCShirt();
        } else {
            return new FCBarcelonaShirt();
        }
    }
}
