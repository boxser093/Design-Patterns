package com.ilya.designpattern.structurepatterns.facade;

public class Engine {
    public void startMotor(PetrolPump petrolPump){
        if(petrolPump.checkFuel()){
            System.out.println("Engine work...");
        }else {
            System.out.println("Engine non start...");
        }
    }
    public void stopMotor(){
        System.out.println("Stop motor...");
    }
}
