package com.ilya.designpattern.generativepatterns.factorymethod;

public class Surgeon implements Doctor{
    @Override
    public void heal() {
        System.out.println("Зашиваем раны");
    }
}
