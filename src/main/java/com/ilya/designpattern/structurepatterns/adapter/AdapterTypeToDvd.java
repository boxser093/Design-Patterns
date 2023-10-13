package com.ilya.designpattern.structurepatterns.adapter;

public class AdapterTypeToDvd extends TapePlayer implements Recoder {

    @Override
    public void record() {
        System.out.println("Запись видео ряда начинается...");
        play();
    }

    @Override
    public void stopRecord() {
        System.out.println("Запись видео ряда остановленна...");
        stop();
    }
}
