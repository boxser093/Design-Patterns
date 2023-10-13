package com.ilya.designpattern.behavioral.command;

public class TaskBar {
    public void create(){
        System.out.println("Create task...");
    }
    public void update(){
        System.out.println("Update task...");
    }
    public void done(){
        System.out.println("Task is done!");
    }
    public void delete(){
        System.out.println("Delete tasks...");
    }

}
