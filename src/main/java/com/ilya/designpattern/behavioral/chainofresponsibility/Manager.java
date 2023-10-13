package com.ilya.designpattern.behavioral.chainofresponsibility;

public class Manager implements AlarmMarket {
    private int level;
    AlarmMarket nextLevel;

    @Override
    public void setLevelUP(AlarmMarket alarmMarket) {
        this.nextLevel = alarmMarket;
    }


    public Manager(int level) {
        this.level = level;
    }

    @Override
    public void writeMessage(String situation, int levelInp) {
        if(levelInp<=level){
            System.out.println("Alarm!!! CALL POLICE!!! : "+situation);
        }
        if(nextLevel!=null){
            nextLevel.writeMessage(situation,levelInp);
        }
    }
}
