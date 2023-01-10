package com.svg.java.designpatterns.structurals.facade.example1;

public class Main {

    public static void main(String[] args) {
        /** Not Facade pattern
        Person person1 = new Person("1112233X", "person1","person1@hotmail.com");
        ValidationService validationService = new ValidationService();
        validationService.validate(person1.getDNI());

        DataBaseService dataBaseService = new DataBaseService();
        dataBaseService.insert(person1);

        EmailService emailService = new EmailService();
        emailService.send("person1@hotmail.com","Hi yeah!");
        */

        /** Facade pattern approach */
        RegistrationService registrationService = new RegistrationService();
        Person person = new Person("1112233Q", "person1", "person1@hotmail.com");
        registrationService.register(person);
    }
}
