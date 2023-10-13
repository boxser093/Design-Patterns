package com.ilya.designpattern.structurepatterns.bridge;

public class Taxi extends Machine {
    public Taxi(Driver driver) {
        super(driver);
    }

    @Override
    public void startMove() {
        driver.drive();
        System.out.println("Start taxi trip...");
    }
}
