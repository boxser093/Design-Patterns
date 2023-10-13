package com.ilya.designpattern.behavioral.command;

public class UpdateCommand implements Command{

    TaskBar taskBar;

    public UpdateCommand(TaskBar taskBar) {
        this.taskBar = taskBar;
    }

    @Override
    public void execute() {
        taskBar.update();
    }
}
