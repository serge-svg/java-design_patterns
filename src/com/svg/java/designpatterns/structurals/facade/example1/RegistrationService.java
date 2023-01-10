package com.svg.java.designpatterns.structurals.facade.example1;

public class RegistrationService {
    /** This example of facade design pattern shows how to implement a
        class 'as a facade' in order to process set of operations in a
       desired way
     */
    private DataBaseService dataBaseService = new DataBaseService();
    private EmailService emailService = new EmailService();
    private ValidationService validationService = new ValidationService();

    public void register(Person person){
        if (validationService.validate(person.getDNI()));
            // Once validated it
            dataBaseService.insert(person);
            emailService.send(person.getEmail(), "Email registered!");
    }
}
