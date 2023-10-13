package com.ilya.designpattern.generativepatterns.abstractfactory.officepc;

import com.ilya.designpattern.generativepatterns.abstractfactory.Motherboard;

public class OfficeMotherboard implements Motherboard {
    @Override
    public void setMotherboard() {
        System.out.println("Set motherboard GIGABYTE A520M S2H ");
    }
}
