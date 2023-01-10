package com.svg.java.designpatterns.creational.abstract_factory.example1;

public class Main {
    /** Also known as factory of factory
     */

    public static void main(String[] args) {
        /** Factory Method approach */
        /*
        FootballShirt barcelonaShirt = FootballShirtFactory.getInstance(FootballClubs.FC_Barcelona);
        barcelonaShirt.setName("Sergio");
        barcelonaShirt.setNumber(5);
        barcelonaShirt.print();

        FootballPants barcelonaPants = FootballPantsFactory.getInstance(FootballClubs.FC_Barcelona);
        barcelonaPants.setNumber(5);
        barcelonaPants.print();

        FootballShirt gironaFCShirt = FootballShirtFactory.getInstance(FootballClubs.Girona_FC);
        gironaFCShirt.setName("Stuani");
        gironaFCShirt.setNumber(9);
        gironaFCShirt.print();

        FootballPants gironaPants = FootballPantsFactory.getInstance(FootballClubs.Girona_FC);
        gironaPants.setNumber(9);
        gironaPants.print();
        */

        /** Abstract factory approach */
        EquipmentAbstractFactory gironaFactory = EquipmentAbstractFactory.getInstance(FootballClubs.Girona_FC);
        FootballShirt gironaShirt = gironaFactory.getFootballShirt();
        gironaShirt.setNumber(9);
        gironaShirt.setName("Stuani");
        gironaShirt.print();

        FootballPants gironaPants =  gironaFactory.getFootballPants();
        gironaPants.setNumber(9);
        gironaPants.print();

        EquipmentAbstractFactory barcelonaFactory = EquipmentAbstractFactory.getInstance(FootballClubs.Girona_FC);
        FootballShirt barcelonaShirt =  barcelonaFactory.getFootballShirt();
        barcelonaShirt.setName("Sergio");
        barcelonaShirt.setNumber(5);
        barcelonaShirt.print();

        FootballPants barcelonaPants = barcelonaFactory.getFootballPants();
        barcelonaPants.setNumber(5);
        barcelonaPants.print();



    }
}
