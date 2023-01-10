package com.svg.java.designpatterns.creational.factory.example1.basic;

class InvoiceWithReducedVAT extends Invoice {

    @Override
    public double getTotalAmount() {
        return this.getAmount()*1.07;
    }

    public InvoiceWithReducedVAT(int number, String concept, double amount) {
        super(number, concept, amount);
    }
}
