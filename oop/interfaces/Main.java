package com.manikanta.oop.interfaces;

public class Main {
    public static void main(String[] args) {
//        Engine car = new Car();
////        car.a;
//        car.acc();
//        car.start();
//        car.stop();
//
//        Media carMedia = new Car();
//        carMedia.stop();

        NiceCar niceCar = new NiceCar();
        niceCar.start();
        niceCar.startMusic();
        niceCar.upgradeEngine(new ElectricEngine());
        niceCar.start();
    }
}
