package com.company;

public class DialPhone extends Phone implements Caller {

    private boolean hasAnswerphone;

    public DialPhone(int serialNum, String name, boolean hasAnswerphone) {
        super(serialNum, name);
        this.hasAnswerphone = hasAnswerphone;
    }

    public DialPhone(boolean hasAnswerphone) {
        this.hasAnswerphone = hasAnswerphone;
    }

    @Override
    void powerOn() {
        System.out.println("Разблокируй телефон");
        System.out.println("Набери номер");
    }

    @Override
    void powerOff() {
        System.out.println("Положи трубку и заблокируй телефон");
    }

    @Override
    public void call() {
        System.out.println("Пошел вызов");
        if (hasAnswerphone == false) {
            autoAnswer();
            powerOff();
        }
    }

    public void autoAnswer() {
        System.out.println("Звони позже. Абонент спит");
    }
}
