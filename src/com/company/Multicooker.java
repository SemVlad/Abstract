package com.company;

public abstract class Multicooker extends AbstractDevice {

    public Multicooker(int serialNum, String name) {
        super(serialNum, name);
    }

    void powerOn() {
        System.out.println("Духовка");
        System.out.println("Включи питание для начала приготовления");
    }

    void powerOff() {
        System.out.println("Отключи питание после приготовления");
    }

    abstract void cook();

}
