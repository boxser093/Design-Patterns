package com.ilya.designpattern.behavioral.visitor;

public class Track implements ElementRoad{
    @Override
    public void driving(Driver driver) {
        driver.drive(this);
    }
}
