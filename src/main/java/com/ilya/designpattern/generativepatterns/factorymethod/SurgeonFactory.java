package com.ilya.designpattern.generativepatterns.factorymethod;

public class SurgeonFactory implements DoctorFactory{
    @Override
    public Doctor createDoctor() {
        return new Surgeon();
    }
}
