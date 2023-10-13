package com.ilya.designpattern.generativepatterns.abstractfactory.gamerpc;

import com.ilya.designpattern.generativepatterns.abstractfactory.*;

public class GamerPCFactory implements PersonalComputerAsseblyLine {
    @Override
    public Motherboard getMotherboard() {
        return new GameMotherboard();
    }

    @Override
    public Chip getChip() {
        return new GameChip();
    }

    @Override
    public Keyboard getKeyboard() {
        return new GameKeyboard();
    }

    @Override
    public Monitor getMonitor() {
        return new GameMonitor();
    }

    @Override
    public Ssd getSdd() {
        return new GameSsd();
    }

    @Override
    public Mouse getMouse() {
        return new GameMouse();
    }
}
