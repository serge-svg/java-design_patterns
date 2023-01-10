package com.svg.java.designpatterns.structurals.composite.example1;


import java.util.ArrayList;
import java.util.List;

public class SingleGift extends Gift {

    public SingleGift(String name) {
        super(name);
    }

    @Override
    public boolean isBoxGift() {
        return false;
    }

    @Override
    public List<Gift> getGifts() {
        return new ArrayList<>();
    }
}
