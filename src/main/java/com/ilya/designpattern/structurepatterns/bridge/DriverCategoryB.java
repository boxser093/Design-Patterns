package com.ilya.designpattern.structurepatterns.bridge;

public class DriverCategoryB implements Driver{
    @Override
    public void drive() {
        System.out.println("Drive a passenger car...");
    }
}
