package com.ilya.designpattern.generativepatterns.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Laptop implements Cloneable{
    private int id;
    private String specialty;
    private String mark;

    @Override
    public Object copy() {
        Laptop copy = new Laptop(++id,specialty,mark);
        return copy;
    }
}
