package com.svg.java.designpatterns.creational.factory.example1.basic;

public class Main {
    
    public static void main(String[] args) {
        InvoiceWithVAT i1 = new InvoiceWithVAT(1000, "computer", 1000.0);
        InvoiceWithReducedVAT i2 = new InvoiceWithReducedVAT(1000, "computer", 1000.0);
        print(i1);
        print(i2);
    }

    public static void print(Invoice i) {
        System.out.println(i.getTotalAmount());
    }

}
