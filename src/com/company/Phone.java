package com.company;

public abstract class Phone extends AbstractDevice {

    public Phone(int serialNum, String name) {
        super(serialNum, name);
    }

    public Phone() {
    }

    abstract void call();
}
