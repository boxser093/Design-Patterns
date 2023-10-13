package com.ilya.designpattern.behavioral.observer;

public class ContinentalRome {
    public static void main(String[] args) {
        Customer santinoDAntonio = new Customer();

        Observer killer = new Killer("Jhon Wick");
        Observer killer1 = new Killer("Cassian");
        Observer killer2 = new Killer("Hitman");

        santinoDAntonio.addObserver(killer);
        santinoDAntonio.addObserver(killer1);
        santinoDAntonio.addObserver(killer2);
        santinoDAntonio.addOrder("Gianna D'Antonio");
        santinoDAntonio.removeVacancy("Gianna D'Antonio");
        System.out.println("Jhon refused, and he will pay very dearly for it.");
        System.out.println("_____________________________________________");
        santinoDAntonio.removeObserver(killer);
        santinoDAntonio.addOrder("Jhon Wick");
    }
}
