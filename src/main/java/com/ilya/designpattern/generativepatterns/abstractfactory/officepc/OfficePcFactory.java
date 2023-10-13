package com.ilya.designpattern.generativepatterns.abstractfactory.officepc;

import com.ilya.designpattern.generativepatterns.abstractfactory.*;

public class OfficePcFactory implements PersonalComputerAsseblyLine {
    @Override
    public Motherboard getMotherboard() {
        return new OfficeMotherboard();
    }

    @Override
    public Chip getChip() {
        return new OfficeChip();
    }

    @Override
    public Keyboard getKeyboard() {
        return new OfficeKeyboard();
    }

    @Override
    public Monitor getMonitor() {
        return new OfficeMonitor();
    }

    @Override
    public Ssd getSdd() {
        return new OfficeSsd();
    }

    @Override
    public Mouse getMouse() {
        return new OfficeMouse();
    }
}
