package com.ilya.designpattern.generativepatterns.factorymethod;

public class PediatricianFactory implements DoctorFactory{
    public Doctor createDoctor() {
        return new Pediatrician();
    }
}
