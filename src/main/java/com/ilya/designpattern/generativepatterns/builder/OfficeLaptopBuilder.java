package com.ilya.designpattern.generativepatterns.builder;

public class OfficeLaptopBuilder extends LaptopBuilder{
    @Override
    void buildMark() {
        laptop.setMark(Mark.APPLE);
    }

    @Override
    void buildPrice() {
        laptop.setPrice(1250);
    }

    @Override
    void buildSpecialty() {
        laptop.setSpecialty(Specialty.OFFICE);
    }
}
