package com.ilya.designpattern.generativepatterns.builder;

public class GameLaptopBuilder extends LaptopBuilder{
    @Override
    void buildMark() {
        laptop.setMark(Mark.HP);
    }

    @Override
    void buildPrice() {
        laptop.setPrice(2500);
    }

    @Override
    void buildSpecialty() {
        laptop.setSpecialty(Specialty.GAME);
    }
}
