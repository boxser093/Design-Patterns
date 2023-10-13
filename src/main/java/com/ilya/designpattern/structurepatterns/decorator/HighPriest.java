package com.ilya.designpattern.structurepatterns.decorator;

public class HighPriest extends DoctorDecorator{

    public HighPriest(Doctor doctor) {
        super(doctor);
    }
    public String healHigh(){
        return "heal curses...";
    }

    @Override
    public String heal() {
        return super.heal()+healHigh();
    }
}
