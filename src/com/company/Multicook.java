package com.company;

public class Multicook extends Multicooker {

    public Multicook(int serialNum, String name) {
        super(serialNum, name);
    }

    @Override
    void cook() {
        System.out.println("Началось приготовление");

    }

    void switchProgram(int numProg) {
        System.out.println("Выбери номер программы : " + numProg);
    }

}
