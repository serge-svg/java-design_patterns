package com.svg.java.designpatterns.creational.factory.example1.basic;

class InvoiceWithVAT extends Invoice {

    @Override
    public double getTotalAmount() {
        return this.getAmount() * 1.21;
    }

    public InvoiceWithVAT(int number, String concept, double amount) {
        super(number, concept, amount);
    }
}
