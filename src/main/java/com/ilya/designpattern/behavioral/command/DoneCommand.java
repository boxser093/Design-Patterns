package com.ilya.designpattern.behavioral.command;

public class DoneCommand implements Command {
    TaskBar taskBar;

    public DoneCommand(TaskBar taskBar) {
        this.taskBar = taskBar;
    }

    @Override
    public void execute() {
        taskBar.done();
    }
}
