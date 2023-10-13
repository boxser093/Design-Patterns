package com.ilya.designpattern.behavioral.visitor;

public class Me implements Driver{
    @Override
    public void drive(City city) {
        System.out.println("Не нарушаем, едем не превышая скорость.");
    }

    @Override
    public void drive(Track track) {
        System.out.println("Можно поддать газку");
    }

    @Override
    public void drive(OffRoad offRoad) {
        System.out.println("Рабоаем на 1-2 перече, руль не удерживаем,\n" +
                "даем выбрать колесам удобный маршрут.");
    }
}
