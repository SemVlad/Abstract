package com.company;

public abstract class AbstractDevice {

    private int serialNum;
    private String name;

    public AbstractDevice(int serialNum, String name) {
        this.serialNum = serialNum;
        this.name = name;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public String getName() {
        return name;
    }

    protected AbstractDevice() {
        powerOn();
    }

    abstract void powerOn();

    abstract void powerOff();
}

