package com.svg.java.designpatterns.structurals.composite.example1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Gift {

    private String name;

    public abstract boolean isBoxGift();

    public abstract List<Gift> getGifts();

}
