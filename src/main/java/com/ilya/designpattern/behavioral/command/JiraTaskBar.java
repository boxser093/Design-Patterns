package com.ilya.designpattern.behavioral.command;

public class JiraTaskBar {
    public static void main(String[] args) {
        TaskBar taskBar = new TaskBar();
        Smartphone smartphone = new Smartphone(new CreateCommand(taskBar),
                new UpdateCommand(taskBar),
                new DoneCommand(taskBar),
                new DeleteCommand(taskBar));
        smartphone.creteTask();
        smartphone.updateTask();
        smartphone.doneTask();
        smartphone.deleteTask();
    }
}
