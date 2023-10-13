package com.ilya.designpattern.behavioral.state;

public class Pug {
    public static void main(String[] args) {
        Activity activity = new Eat();
        Dog pug = new Dog();

        pug.setActivity(activity);

        for (int i = 0; i < 10; i++) {
            pug.doIt();
            pug.changeActivity();
        }

    }
}
