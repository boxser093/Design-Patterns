package com.ilya.designpattern.generativepatterns.abstractfactory.gamerpc;

import com.ilya.designpattern.generativepatterns.abstractfactory.Mouse;

public class GameMouse implements Mouse {
    @Override
    public void setMouse() {
        System.out.println("Set mouse Logitech G G502 Hero");
    }
}
