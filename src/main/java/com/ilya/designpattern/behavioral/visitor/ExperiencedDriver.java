package com.ilya.designpattern.behavioral.visitor;

public class ExperiencedDriver implements Driver{
    @Override
    public void drive(City city) {
        System.out.println("Не превышаем 40 км/ч, \n" +
                "останавливаеся на завершающий сигнал светофора.");
    }

    @Override
    public void drive(Track track) {
        System.out.println("Не гоним, не превышаем скорости на знаках,\n" +
                "чтобы не увеличивать тормозной путь в случае ЧС");
    }

    @Override
    public void drive(OffRoad offRoad) {
        System.out.println("Лучше объехать такую дорогу.");
    }
}
