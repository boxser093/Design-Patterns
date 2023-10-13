package com.ilya.designpattern.behavioral.strategy;

public class CatRunner {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setActivity(new MeowLoudly());
         cat.executeActivity();
        cat.setActivity(new JumpOnTheMonitor());
        cat.executeActivity();
        cat.setActivity(new ScratchingTheSofa());
        cat.executeActivity();
        cat.setActivity(new Shit());
        cat.executeActivity();
    }
}
