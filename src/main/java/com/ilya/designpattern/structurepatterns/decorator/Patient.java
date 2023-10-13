package com.ilya.designpattern.structurepatterns.decorator;

public class Patient {
    public static void main(String[] args) {
    Doctor support = new Acolyte();
        System.out.println(support.heal());
        support = new Priest(new Acolyte());
        System.out.println(support.heal());
        support = new HighPriest(new Priest(new Acolyte()));
        System.out.println(support.heal());
    }

}
