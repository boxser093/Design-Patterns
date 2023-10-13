package com.ilya.designpattern.behavioral.chainofresponsibility;

public class Administrator implements AlarmMarket {
    private int level;
    AlarmMarket nextLevel;

    @Override
    public void setLevelUP(AlarmMarket alarmMarket) {
        this.nextLevel = alarmMarket;
    }


    public Administrator(int level) {
        this.level = level;
    }

    @Override
    public void writeMessage(String situation, int levelInp) {
        if(levelInp<=level){
            System.out.println("Call administrator to security market: "+situation);
        }
        if(nextLevel!=null){
            nextLevel.writeMessage(situation,levelInp);
        }
    }
}
