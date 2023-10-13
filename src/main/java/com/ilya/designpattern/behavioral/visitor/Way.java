package com.ilya.designpattern.behavioral.visitor;

public class Way implements ElementRoad{
    ElementRoad[] elementRoad;

    public Way() {
        this.elementRoad = new ElementRoad[]{
                new City(),
                new OffRoad(),
                new Track()
        };
    }

    @Override
    public void driving(Driver driver) {
        for (ElementRoad elementRoad1: elementRoad){
            elementRoad1.driving(driver);
        }
    }
}
