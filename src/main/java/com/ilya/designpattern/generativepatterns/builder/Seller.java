package com.ilya.designpattern.generativepatterns.builder;

public class Seller {
    LaptopBuilder builder;

    public void setBuilder(LaptopBuilder builder){
        this.builder = builder;
    }

    Laptop buildLaptop() {
        builder.createPC();
        builder.buildMark();
        builder.buildSpecialty();
        builder.buildPrice();

        Laptop laptop = builder.getLaptop();
        return laptop;
    }

}
