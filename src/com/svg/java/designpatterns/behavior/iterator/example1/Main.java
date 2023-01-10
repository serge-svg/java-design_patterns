package com.svg.java.designpatterns.behavior.iterator.example1;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        HouseBuilder builder = new HouseBuilder();
        builder.setDecorationOfTheHouse("Decoration classic");
        builder.setWallsOfTheHouse("Walls of bricks");
        builder.setBaseOfTheHouse("Base of concrete");
        builder.setRoofOfTheHouse("Roof of roof tiles");


        Iterator<String> builderIterator = builder.iterator();

        while (builderIterator.hasNext()) {
            System.out.println(builderIterator.next());
        }

        while (builderIterator.hasNext()) {
            System.out.println(builderIterator.next());
        }

        for(String zone : builder){
            System.out.println(zone);
        }
    }
}
