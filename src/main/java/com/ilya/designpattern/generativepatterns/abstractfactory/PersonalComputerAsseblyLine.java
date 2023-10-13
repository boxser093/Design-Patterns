package com.ilya.designpattern.generativepatterns.abstractfactory;

public interface PersonalComputerAsseblyLine {
    Motherboard getMotherboard();

    Chip getChip();

    Keyboard getKeyboard();

    Monitor getMonitor();

    Ssd getSdd();

    Mouse getMouse();
}
