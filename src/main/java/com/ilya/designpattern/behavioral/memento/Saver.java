package com.ilya.designpattern.behavioral.memento;

import java.util.Date;

public class Saver {
    private final String saveName;

    public String getSaveName() {
        return saveName;
    }

    private final Date date;

    public Date getDate() {
        return date;
    }

    public Saver(String saveName) {
        this.saveName = saveName;
        this.date = new Date();
    }
}
