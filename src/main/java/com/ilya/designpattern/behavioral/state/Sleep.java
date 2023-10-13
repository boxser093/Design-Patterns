package com.ilya.designpattern.behavioral.state;

public class Sleep implements Activity{
    @Override
    public void doIt() {
        System.out.println("Zzzz-Zzzz");
    }
}
