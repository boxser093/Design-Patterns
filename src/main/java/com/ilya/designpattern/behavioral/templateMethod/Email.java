package com.ilya.designpattern.behavioral.templateMethod;

public class Email extends Mail{
    private String bodyMail;

    public Email(Sender sender, Addressee addressee, String bodyMail) {
        super(sender, addressee);
        this.bodyMail = bodyMail;
    }


    @Override
    void body() {
        System.out.println(bodyMail);
    }

    @Override
    void printMail() {
        System.out.println(Email.class);
    }
}
