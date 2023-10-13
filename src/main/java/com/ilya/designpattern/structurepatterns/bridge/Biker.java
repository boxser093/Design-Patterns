package com.ilya.designpattern.structurepatterns.bridge;

public class Biker extends Machine{
    public Biker(Driver driver) {
        super(driver);
    }

    @Override
    public void startMove() {
        driver.drive();
        System.out.println("Biker start motorcycle race...");
    }
}
