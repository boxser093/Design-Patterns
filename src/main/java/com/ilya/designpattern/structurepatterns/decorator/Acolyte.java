package com.ilya.designpattern.structurepatterns.decorator;

public class Acolyte implements Doctor{
    @Override
    public String heal() {
        return "Heal...";
    }
}
