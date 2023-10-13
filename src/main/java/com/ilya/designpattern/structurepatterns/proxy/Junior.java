package com.ilya.designpattern.structurepatterns.proxy;

public class Junior implements Developer{
    private String task;

    public Junior(String name) {
        this.task = name;
    }

    @Override
    public void writeCode() {
        System.out.println("Solving a "+task+"...");
    }
}
