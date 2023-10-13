package com.ilya.designpattern.behavioral.visitor;

public class WayToTheMountains {
    public static void main(String[] args) {
        Way way = new Way();
        Driver myGirlFriend = new NoviceDriver();
        Driver friend = new ExperiencedDriver();
        Driver me = new Me();

        System.out.println("Выехали из города, за рулем моя девушка.");
        way.driving(myGirlFriend);
        System.out.println("Часть пути проехали, началась сложная дорога,\n" +
                "за руль садиться мой друг.");
        way.driving(friend);
        System.out.println("Почти приехали, друг устал и попросил сеть меня за руль.");
        way.driving(me);
        System.out.println("Приехали! ");
    }
}
