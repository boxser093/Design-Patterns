package com.ilya.designpattern.behavioral.command;

public class CreateCommand implements Command{

    TaskBar taskBar;

    public CreateCommand(TaskBar taskBar) {
        this.taskBar = taskBar;
    }

    @Override
    public void execute() {
        taskBar.create();
    }
}
