package com.ilya.designpattern.structurepatterns.facade;

public class StartButton {
    public void drive() {
        PetrolPump petrolPump = new PetrolPump();
        petrolPump.refuel();
        petrolPump.startPump();
        Starter starter = new Starter();
        starter.doStart();
        Engine engine = new Engine();
        engine.startMotor(petrolPump);
    }
    public void stop(){
        PetrolPump petrolPump = new PetrolPump();
        petrolPump.refuel();
        petrolPump.finishPump();
        Engine engine = new Engine();
        engine.stopMotor();
    }
}
