package com.ilya.designpattern.behavioral.templateMethod;

public class Sender {
    private String name;
    private String end;

    public void setEnd(String end) {
        this.end = end;
    }

    public String getName() {
        return name;
    }

    public String getEnd() {
        return end;
    }

    public Sender(String name) {
        this.name = name;
    }

}
