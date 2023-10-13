package com.ilya.designpattern.generativepatterns.builder;

public abstract class LaptopBuilder {
    Laptop laptop;
    void createPC(){
        laptop = new Laptop();
    }
    abstract void buildMark();
    abstract void buildPrice();
    abstract void buildSpecialty();

    Laptop getLaptop(){
        return laptop;
    }
}
