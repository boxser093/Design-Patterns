package com.ilya.designpattern.generativepatterns.prototype;

public class LaptopFactory {
    Laptop laptop;

    public LaptopFactory(Laptop laptop){
        this.laptop = laptop;
    }
    public void setLaptop(Laptop laptop){
        this.laptop = laptop;
    }
    Laptop cloneLaptop(){
        return (Laptop) laptop.copy();
    }

}
