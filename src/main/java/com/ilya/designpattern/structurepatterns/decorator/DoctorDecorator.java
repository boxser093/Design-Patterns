package com.ilya.designpattern.structurepatterns.decorator;

public class DoctorDecorator implements Doctor{
    Doctor doctor;

    public DoctorDecorator(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String heal() {
        return doctor.heal();
    }
}
