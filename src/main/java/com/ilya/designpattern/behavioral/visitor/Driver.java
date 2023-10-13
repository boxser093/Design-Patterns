package com.ilya.designpattern.behavioral.visitor;

public interface Driver {
    void drive(City city);
    void drive(Track track);
    void drive(OffRoad offRoad);
}
