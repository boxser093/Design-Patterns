package com.ilya.designpattern.generativepatterns.abstractfactory.gamerpc;

import com.ilya.designpattern.generativepatterns.abstractfactory.Keyboard;

public class GameKeyboard implements Keyboard {
    @Override
    public void setKeyBoard() {
        System.out.println("Set keyboard Razer Cynosa V2");
    }
}
