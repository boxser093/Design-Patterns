package com.ilya.designpattern.generativepatterns.factorymethod;

public class Traumatologist implements Doctor{
    @Override
    public void heal() {
        System.out.println("Лечим травмы");
    }
}
