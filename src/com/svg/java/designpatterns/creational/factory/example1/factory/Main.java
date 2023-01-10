package com.svg.java.designpatterns.creational.factory.example1.factory;

import com.svg.java.designpatterns.creational.factory.example1.basic.*;

public class Main {
    
    public static void main(String[] args) {

        Invoice i1 = InvoicesFactory.getInvoiceWithVAT(1002, "screen", 100.0);
        Invoice i2 = InvoicesFactory.getInvoiceWithReduceVAT(1002, "screen", 100.0);
        print(i1);
        print(i2);
    }

    public static void print(Invoice i) {
        System.out.println(i.getTotalAmount());
    }

}

