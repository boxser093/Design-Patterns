package com.ilya.designpattern.generativepatterns.abstractfactory.gamerpc;

import com.ilya.designpattern.generativepatterns.abstractfactory.Ssd;

public class GameSsd implements Ssd {
    @Override
    public void setSsd() {
        System.out.println("Set SSD Kingston Fury Renegade 500Gb");
    }
}
