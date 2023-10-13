package com.ilya.designpattern.generativepatterns.abstractfactory;

import com.ilya.designpattern.generativepatterns.abstractfactory.gamerpc.GamerPCFactory;
import com.ilya.designpattern.generativepatterns.abstractfactory.officepc.OfficePcFactory;

public class GamerPC {
    public static void main(String[] args) {
        PersonalComputerAsseblyLine factory = new GamerPCFactory();
        Motherboard motherboard = factory.getMotherboard();
        Chip chip = factory.getChip();
        Monitor monitor = factory.getMonitor();
        Ssd ssd = factory.getSdd();
        Keyboard keyboard = factory.getKeyboard();
        Mouse mouse = factory.getMouse();
        System.out.println("Create game PC");
        motherboard.setMotherboard();
        chip.setChip();
        monitor.setMonitor();
        ssd.setSsd();
        keyboard.setKeyBoard();
        mouse.setMouse();
        System.out.println("Creation game PC completed ");
        System.out.println("=========================================");
        PersonalComputerAsseblyLine factoryOffice = new OfficePcFactory();
        Motherboard motherboard1 = factoryOffice.getMotherboard();
        Chip chip1 = factoryOffice.getChip();
        Monitor monitor1 = factoryOffice.getMonitor();
        Ssd ssd1 = factoryOffice.getSdd();
        Keyboard keyboard1 = factoryOffice.getKeyboard();
        Mouse mouse1 = factoryOffice.getMouse();
        System.out.println("Create office PC");
        motherboard1.setMotherboard();
        chip1.setChip();
        monitor1.setMonitor();
        ssd1.setSsd();
        keyboard1.setKeyBoard();
        mouse1.setMouse();
        System.out.println("Creation office PC completed ");


    }



}
