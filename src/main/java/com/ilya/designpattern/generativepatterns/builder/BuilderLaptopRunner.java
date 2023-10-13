package com.ilya.designpattern.generativepatterns.builder;

public class BuilderLaptopRunner {
    public static void main(String[] args) {
        Seller seller = new Seller();
        seller.setBuilder(new GameLaptopBuilder());
        Laptop laptop = seller.buildLaptop();
        System.out.println(laptop);
        seller.setBuilder(new OfficeLaptopBuilder());
        Laptop laptop1 = seller.buildLaptop();
        System.out.println(laptop1);
    }
}
