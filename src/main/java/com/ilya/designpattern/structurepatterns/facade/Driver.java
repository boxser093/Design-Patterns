package com.ilya.designpattern.structurepatterns.facade;

public class Driver {
    public static void main(String[] args) {
    StartButton startButton = new StartButton();
    startButton.drive();
        System.out.println("_________________________");
    startButton.stop();
    }
}
