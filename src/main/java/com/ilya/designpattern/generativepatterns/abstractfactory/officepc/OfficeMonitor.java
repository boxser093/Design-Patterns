package com.ilya.designpattern.generativepatterns.abstractfactory.officepc;

import com.ilya.designpattern.generativepatterns.abstractfactory.Monitor;

public class OfficeMonitor implements Monitor {
    @Override
    public void setMonitor() {
        System.out.println("Set monitor Dexp 412T");
    }
}
