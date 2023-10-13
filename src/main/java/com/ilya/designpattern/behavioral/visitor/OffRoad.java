package com.ilya.designpattern.behavioral.visitor;

public class OffRoad implements ElementRoad{
    @Override
    public void driving(Driver driver) {
        driver.drive(this);
    }
}
