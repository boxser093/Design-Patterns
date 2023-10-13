package com.ilya.designpattern.generativepatterns.abstractfactory.officepc;

import com.ilya.designpattern.generativepatterns.abstractfactory.Keyboard;

public class OfficeKeyboard implements Keyboard {
    @Override
    public void setKeyBoard() {
        System.out.println("Set keyboard Defender p100");
    }
}
