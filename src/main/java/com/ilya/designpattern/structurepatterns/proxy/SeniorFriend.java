package com.ilya.designpattern.structurepatterns.proxy;

public class SeniorFriend implements Developer{
    private String task;
    private Junior junior;

    public SeniorFriend(String task) {
        this.task = task;
    }

    @Override
    public void writeCode() {
        System.out.println("Help with the task...");
        if(junior==null){
            junior = new Junior(task);
        }
        junior.writeCode();
    }
}
