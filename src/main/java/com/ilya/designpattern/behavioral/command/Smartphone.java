package com.ilya.designpattern.behavioral.command;

public class Smartphone {
    Command create;
    Command update;
    Command done;
    Command delete;

    public Smartphone(Command create, Command update, Command done, Command delete) {
        this.create = create;
        this.update = update;
        this.done = done;
        this.delete = delete;
    }

    public void creteTask(){
        create.execute();
    }
    public void updateTask(){
        update.execute();
    }
    public void doneTask(){
        done.execute();
    }
    public void deleteTask(){
        delete.execute();
    }

}
