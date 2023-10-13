package com.ilya.designpattern.behavioral.chainofresponsibility;

public class TabrisMarket {
    public static void main(String[] args) {
        AlarmMarket first = new SellerStore(Level.WHITE);
        AlarmMarket second = new Administrator(Level.BLUE);
        AlarmMarket third = new Manager(Level.RED);
        first.setLevelUP(second);
        second.setLevelUP(third);
        first.writeMessage("Man with weapon in market",Level.RED);
    }
}
