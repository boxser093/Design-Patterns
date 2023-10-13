package com.ilya.designpattern.generativepatterns.abstractfactory.officepc;

import com.ilya.designpattern.generativepatterns.abstractfactory.Mouse;

public class OfficeMouse implements Mouse {
    @Override
    public void setMouse() {
        System.out.println("Set mouse Logitech F100");
    }
}
