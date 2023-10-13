package com.ilya.designpattern.structurepatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Party implements Pioneer{
    private List<Pioneer> formation = new ArrayList<>();
    public void addToFormation(Pioneer pioneer){
        formation.add(pioneer);
    }
    public void removeFromFormation(Pioneer pioneer){
        formation.add(pioneer);
    }

    @Override
    public void greetingPioneer() {
        for (Pioneer pioneer: formation){
            pioneer.greetingPioneer();
        }
    }
}
