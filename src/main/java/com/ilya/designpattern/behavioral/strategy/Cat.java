package com.ilya.designpattern.behavioral.strategy;

public class Cat {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity(){
        activity.justDoIt();
    }
}
