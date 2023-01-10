package com.svg.java.designpatterns.creational.prototype.example1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DocumentPrototype implements Cloneable{
    /**
     * This example of prototype design pattern shows how to implement it
     * in order to reuse part of the prototype object
     */
    private String header;
    private String footer;
    private String body;

    public Object clone() {
        DocumentPrototype documentCloned = new DocumentPrototype();
        documentCloned.setHeader(this.getHeader());
        documentCloned.setFooter(this.getFooter());
        return documentCloned;
    }

    @Override
    public String toString() {
        return "Document: \n" +
                header + "\n" +
                body   + "\n" +
                footer + "\n";
    }

}
