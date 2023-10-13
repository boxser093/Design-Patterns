package com.ilya.designpattern.behavioral.chainofresponsibility;

public class SellerStore implements AlarmMarket {
    private int level;
    AlarmMarket nextLevel;

    public SellerStore(int level) {
        this.level = level;
    }

    @Override
    public void writeMessage(String situation, int levelInp) {
        if(levelInp<=level){
            System.out.println("Zin zin: "+situation);
        }
        if(nextLevel!=null){
            nextLevel.writeMessage(situation,levelInp);
        }
    }

    @Override
    public void setLevelUP(AlarmMarket alarmMarket) {
        this.nextLevel = alarmMarket;
    }
}
