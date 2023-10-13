package com.ilya.designpattern.behavioral.memento;

public class SaveFolder {
    private Saver saver;

    public Saver getSaver() {
        return saver;
    }

    public void setSaver(Saver saver) {
        this.saver = saver;
    }
}
