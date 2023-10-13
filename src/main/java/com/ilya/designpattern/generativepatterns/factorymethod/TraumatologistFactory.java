package com.ilya.designpattern.generativepatterns.factorymethod;

public class TraumatologistFactory implements DoctorFactory{
    @Override
    public Doctor createDoctor() {
        return new Traumatologist();
    }
}
