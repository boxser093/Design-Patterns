package com.ilya.designpattern.structurepatterns.proxy;

public class RealWork {
    public static void main(String[] args) {
        Developer developer = new SeniorFriend("Backend job");
        developer.writeCode();
    }
}
