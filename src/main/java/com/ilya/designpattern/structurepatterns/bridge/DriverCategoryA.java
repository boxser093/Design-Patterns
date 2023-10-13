package com.ilya.designpattern.structurepatterns.bridge;

public class DriverCategoryA implements Driver{
    @Override
    public void drive() {
        System.out.println("Drive a motorcycle....");
    }
}
