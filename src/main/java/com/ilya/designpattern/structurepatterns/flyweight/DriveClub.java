package com.ilya.designpattern.structurepatterns.flyweight;

import java.util.ArrayList;
import java.util.List;

public class DriveClub {
    public static void main(String[] args) {
        Circus circus = new Circus();
        List<Driver> drivers = new ArrayList<>();
        drivers.add(circus.getDriverByCategory("A"));
        drivers.add(circus.getDriverByCategory("A"));
        drivers.add(circus.getDriverByCategory("A"));
        drivers.add(circus.getDriverByCategory("B"));
        drivers.add(circus.getDriverByCategory("B"));
        drivers.add(circus.getDriverByCategory("B"));
        printer(drivers);

    }
    public static void printer(List<Driver> drivers){
        for (Driver driver: drivers){
            driver.drive();
        }
    }
}
