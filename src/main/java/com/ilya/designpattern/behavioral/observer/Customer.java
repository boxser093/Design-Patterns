package com.ilya.designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Customer implements Observed{

    List<String> orders = new ArrayList<>();
    List<Observer> killers = new ArrayList<>();

    public void addOrder(String aim){
        this.orders.add(aim);
        notifyObservers();
    }

    public void removeVacancy(String aim){
        this.orders.remove(aim);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.killers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.killers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: killers){
            observer.handleEvent(orders);
        }
    }
}
