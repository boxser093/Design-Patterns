package com.ilya.designpattern.structurepatterns.bridge;

public class Cargo extends Machine {
    public Cargo(Driver driver) {
        super(driver);
    }

    @Override
    public void startMove() {
        driver.drive();
        System.out.println("Start a delivery cargo..");
    }
}
