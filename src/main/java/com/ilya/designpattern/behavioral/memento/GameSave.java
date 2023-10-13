package com.ilya.designpattern.behavioral.memento;

import java.util.Date;

public class GameSave {
    private String saveName;
    private Date date;

    public void setVersionAndDate(String version){
        this.saveName = version;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "Save Game:"+ saveName + ".\nDate: " + date + ".";
    }

    public Saver save(){
        return new Saver(saveName);
    }
    public void load(Saver saver){
        saveName = saver.getSaveName();
        date = saver.getDate();
    }

}
