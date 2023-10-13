package com.ilya.designpattern.behavioral.templateMethod;

public abstract class Mail {
    Sender sender;
    Addressee addressee;
    void sendMail(){
        System.out.println("Dear "+ addressee.getName()+",");
        body();
        System.out.println(sender.getEnd());
    }

    public Mail(Sender sender, Addressee addressee) {
        this.sender = sender;
        this.addressee = addressee;
    }

    abstract void body();
    abstract void printMail();
}
