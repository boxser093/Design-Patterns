package com.ilya.designpattern.structurepatterns.facade;

public class PetrolPump {
    private boolean fuel;

    public boolean checkFuel(){
        return fuel;
    }

    public void refuel(){
        fuel = true;
    }

    public void startPump(){
        System.out.println("Fuel supply...");
    }
    public void finishPump(){
        System.out.println("Stop fuel pump...");
    }

}
