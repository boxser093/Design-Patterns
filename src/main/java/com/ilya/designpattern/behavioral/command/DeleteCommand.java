package com.ilya.designpattern.behavioral.command;

public class DeleteCommand implements Command{
    TaskBar taskBar;

    public DeleteCommand(TaskBar taskBar) {
        this.taskBar = taskBar;
    }

    @Override
    public void execute() {
        taskBar.delete();
    }
}
