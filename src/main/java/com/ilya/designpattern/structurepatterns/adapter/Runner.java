package com.ilya.designpattern.structurepatterns.adapter;

public class Runner {
    public static void main(String[] args) {
       Recoder recoder = new AdapterTypeToDvd();
       recoder.record();
       recoder.stopRecord();
    }
}
