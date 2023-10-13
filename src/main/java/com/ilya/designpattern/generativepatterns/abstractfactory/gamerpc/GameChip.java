package com.ilya.designpattern.generativepatterns.abstractfactory.gamerpc;

import com.ilya.designpattern.generativepatterns.abstractfactory.Chip;

public class GameChip implements Chip {
    @Override
    public void setChip() {
        System.out.println("Set chip AMD Ryzen 5 3600");
    }
}
