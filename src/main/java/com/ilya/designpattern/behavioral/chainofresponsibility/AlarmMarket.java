package com.ilya.designpattern.behavioral.chainofresponsibility;

public interface AlarmMarket {
    void writeMessage(String situation, int level);
    void setLevelUP(AlarmMarket alarmMarket);
}
