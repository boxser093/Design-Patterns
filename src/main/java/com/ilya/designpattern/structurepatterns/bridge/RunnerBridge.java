package com.ilya.designpattern.structurepatterns.bridge;

public class RunnerBridge {
    public static void main(String[] args) {
        Machine[] cars = {new Cargo(new DriverCategoryB()),
                      new Taxi(new DriverCategoryE()),
                        new Biker(new DriverCategoryA())};



        for (Machine car: cars){
            car.startMove();
        }
    }
}
