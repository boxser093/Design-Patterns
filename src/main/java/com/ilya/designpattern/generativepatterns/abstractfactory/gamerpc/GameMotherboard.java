package com.ilya.designpattern.generativepatterns.abstractfactory.gamerpc;

import com.ilya.designpattern.generativepatterns.abstractfactory.Motherboard;

public class GameMotherboard implements Motherboard {
    @Override
    public void setMotherboard() {
        System.out.println("Set motherboard ASRock B450 Steel Legend");
    }
}
