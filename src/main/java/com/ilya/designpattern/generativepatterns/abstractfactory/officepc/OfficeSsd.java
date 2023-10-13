package com.ilya.designpattern.generativepatterns.abstractfactory.officepc;

import com.ilya.designpattern.generativepatterns.abstractfactory.Ssd;

public class OfficeSsd implements Ssd {
    @Override
    public void setSsd() {
        System.out.println("Set SSD Kingston 256Gb");
    }
}
