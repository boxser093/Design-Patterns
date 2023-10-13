package com.ilya.designpattern.structurepatterns.composite;

public class Student implements Pioneer{
    @Override
    public void greetingPioneer() {
        System.out.println("Salute frome students....");
    }
}
