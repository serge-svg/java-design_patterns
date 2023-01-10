package com.svg.java.designpatterns.structurals.composite.example1;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class BoxGift extends Gift {
/*** This class can have a recursive behavior due it has others gifts */

    // Due it is a list of Gift, it can contain singleGift or boxGift
    private List<Gift> gifts = new ArrayList<>();

    public BoxGift(String name) {
        super(name);
    }

    @Override
    public boolean isBoxGift() {
        return true;
    }

    public void addGift(Gift gift) {
        gifts.add(gift);
    }
}
