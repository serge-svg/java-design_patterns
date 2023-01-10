package com.svg.java.designpatterns.creational.prototype.example1;

public class Main {

    public static void main(String[] args) {
        DocumentPrototype initialDocument = new DocumentPrototype();
        initialDocument.setHeader("Example of a fix reusable header");
        initialDocument.setFooter("Example of a fix reusable footer");

        DocumentPrototype document1 = (DocumentPrototype) initialDocument.clone();
        document1.setBody("Body text example");

        DocumentPrototype document2 = (DocumentPrototype) initialDocument.clone();
        document2.setBody("Another body text example");

        System.out.println(document1);
        System.out.println(document2);


    }
}
