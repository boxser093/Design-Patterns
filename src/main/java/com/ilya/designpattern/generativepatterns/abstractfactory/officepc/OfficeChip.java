package com.ilya.designpattern.generativepatterns.abstractfactory.officepc;

import com.ilya.designpattern.generativepatterns.abstractfactory.Chip;

public class OfficeChip implements Chip {
    @Override
    public void setChip() {
        System.out.println("Set chip AMD Ryzen 3 1600");
    }
}
