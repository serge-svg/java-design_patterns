package com.svg.java.designpatterns.behavior.iterator.example1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Iterator;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HouseBuilder implements Iterable<String> {
    /**
     * This example of iterator design pattern shows how to implement/override
     * an iterator to adjust it to a desired behavior
     */

    private String baseOfTheHouse;
    private String wallsOfTheHouse;
    private String roofOfTheHouse;
    private String decorationOfTheHouse;

    private int position = 0; // This is to set an order
    private int count = 0;

    @Override
    public Iterator<String> iterator() {

        return new Iterator<String>() {

            @Override
            public boolean hasNext() {
                if (HouseBuilder.this.position >= 4) {
                    position = 0;
                    return false;
                } else {
                    return true;
                }
            }

            @Override
            public String next() {
                if (HouseBuilder.this.position == 0 && HouseBuilder.this.baseOfTheHouse != null) {
                    HouseBuilder.this.position++;
                    return baseOfTheHouse;
                }

                if (HouseBuilder.this.position == 1 && HouseBuilder.this.wallsOfTheHouse != null) {
                    HouseBuilder.this.position++;
                    return wallsOfTheHouse;
                }

                if (HouseBuilder.this.position == 2 && HouseBuilder.this.roofOfTheHouse != null) {
                    HouseBuilder.this.position++;
                    return roofOfTheHouse;
                }

                if (HouseBuilder.this.position == 3 && HouseBuilder.this.decorationOfTheHouse != null) {
                    HouseBuilder.this.position++;
                    return decorationOfTheHouse;
                }
                throw new IndexOutOfBoundsException();
            }
        };
    }

    public void setBaseOfTheHouse(String baseOfTheHouse) {
        this.baseOfTheHouse = baseOfTheHouse;
    }

    public void setWallsOfTheHouse(String wallsOfTheHouse) {
        this.wallsOfTheHouse = wallsOfTheHouse;
    }

    public void setRoofOfTheHouse(String roofOfTheHouse) {
        this.roofOfTheHouse = roofOfTheHouse;
    }

    public void setDecorationOfTheHouse(String decorationOfTheHouse) {
        this.decorationOfTheHouse = decorationOfTheHouse;
    }


}
