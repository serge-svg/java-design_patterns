package com.svg.java.designpatterns.creational.factory.example1.basic;

public class InvoicesFactory {
    /**
     * This example of Factory design pattern shows how to use a factory class to create
     * other classes and take advantage of the polymorphism
     */

    public static Invoice getInvoiceWithVAT(int number, String concept, double amount){
        InvoiceWithVAT i = new InvoiceWithVAT(number, concept, amount);
        return i;
    }

    public static Invoice getInvoiceWithReduceVAT(int number, String concept, double amount){
        InvoiceWithReducedVAT i = new InvoiceWithReducedVAT(number, concept, amount);
        return i;
    }

    
}
