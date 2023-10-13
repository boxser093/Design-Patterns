package com.ilya.designpattern.behavioral.visitor;

public class NoviceDriver implements Driver{
    @Override
    public void drive(City city) {
        System.out.println("Ой проехал на красный!");
    }

    @Override
    public void drive(Track track) {
        System.out.println("Боюсь так быстро ездить по автобану.");
    }

    @Override
    public void drive(OffRoad offRoad) {
        System.out.println("Кто опытный? Сядьте за руль.");
    }
}
