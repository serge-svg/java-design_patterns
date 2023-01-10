package com.svg.java.designpatterns.creational.factory.example1.basic;

public abstract class Invoice {

    private final int number;
    private final String concept;
    private final double amount;
    
    public int getNumber() {
        return number;
    }

    public String getConcept() {
        return concept;
    }

    public double getAmount() {
        return amount;
    }

    public Invoice(int number, String concept, double amount) {
        this.number = number;
        this.concept = concept;
        this.amount = amount;
    }

    public abstract double getTotalAmount();

}
