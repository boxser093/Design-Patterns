package com.ilya.designpattern.generativepatterns.abstractfactory.gamerpc;

import com.ilya.designpattern.generativepatterns.abstractfactory.Monitor;

public class GameMonitor implements Monitor {
    @Override
    public void setMonitor() {
        System.out.println("Set monitor DELL S2422HG");
    }
}
