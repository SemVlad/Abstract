package com.company;

public class Mobile extends Phone {

    private int simCount;
    private double display;

    public Mobile(int serialNum, String name, int simCount, double display) {
        super(serialNum, name);
        this.simCount = simCount;
        this.display = display;
    }

    public Mobile(int simCount, double display) {
        this.simCount = simCount;
        this.display = display;
    }

    public int getSimCount() {
        return simCount;
    }

    public double getDisplay() {
        return display;
    }

    @Override
    void powerOn() {
        System.out.println("Для включения зажми кнопку и подержи");

    }

    @Override
    void powerOff() {
        System.out.println("Для выключения нажми на кнопку");
    }

    @Override
    void call() {
        System.out.println("Набери номер и нажми кнопку вызова");
    }
}
