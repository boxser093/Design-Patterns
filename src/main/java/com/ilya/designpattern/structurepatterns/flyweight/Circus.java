package com.ilya.designpattern.structurepatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Circus {
    private static final Map<String, Driver> drivers = new HashMap<>();

    public Driver getDriverByCategory(String category) {

        Driver driver = drivers.get(category);

        if(driver == null){
            switch (category){
                case "A":
                    System.out.println("A new actor category A...");
                    driver = new DriverCategoryA();
                    break;
                case "B":
                    System.out.println("A new actor category B...");
                    driver = new DriverCategoryB();
                     break;
            }
            drivers.put(category,driver);
        }
        return driver;
    }
}
