package com.ilya.designpattern.structurepatterns.bridge;

public abstract class Machine {
    Driver driver;

    public Machine(Driver driver) {
        this.driver = driver;
    }

    public abstract void startMove();
}
