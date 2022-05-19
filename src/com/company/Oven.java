package com.company;

public class Oven extends Multicooker {

    public Oven(int serialNum, String name) {
        super(serialNum, name);
    }

    void initTimer(int time) {
        System.out.println("Установи время приготовления: " + time);
    }

    @Override
    void cook() {
        System.out.println("Процесс приготовления запущен");
    }
}
