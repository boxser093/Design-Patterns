package com.ilya.designpattern.behavioral.observer;

import java.util.List;

public class Killer implements Observer{
    private String name;

    public String getName() {
        return name;
    }

    public Killer(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> newOrder) {
        System.out.println("Dear " + name + " new order.");
        if (newOrder.isEmpty()){
            System.out.println("No open orders.");
        } else {
            System.out.println(newOrder);
        }
        System.out.println("___________________________________________");
    }
}
