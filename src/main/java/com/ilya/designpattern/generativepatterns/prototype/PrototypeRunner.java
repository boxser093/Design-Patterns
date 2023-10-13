package com.ilya.designpattern.generativepatterns.prototype;

public class PrototypeRunner {
    public static void main(String[] args) {
        Laptop firstPrototype = new Laptop(1,"Game","HP");
        System.out.println(firstPrototype+"\n");
        LaptopFactory factory = new LaptopFactory(firstPrototype);
        Laptop prototype2 = factory.cloneLaptop();
        System.out.println(prototype2+"\n");

    }
}
