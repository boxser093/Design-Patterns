package com.ilya.designpattern.structurepatterns.decorator;

public class Priest extends DoctorDecorator  {

    public Priest(Doctor doctor) {
        super(doctor);
    }

    public String magicHeal(){
        return " heal poison...";
    }

    @Override
    public String heal() {
        return super.heal() + magicHeal();
    }
}
