package com.company;

public class SmartPhone extends Mobile implements Caller, EmailSender {

    private String os;

    public SmartPhone(int serialNum, String name, int simCount, double display, String os) {
        super(serialNum, name, simCount, display);
        this.os = os;
    }

    public SmartPhone(int simCount, double display, String os) {
        super(simCount, display);
        this.os = os;
    }

    public String getOs() {
        return os;
    }

    void runApp() {
        System.out.println("Нажми на иконку приложения для запуска");

    }

    @Override
    public void call() {
        System.out.println("звоним с интерфейса");
    }

    @Override
    public String editMail(String edit) {

        return edit;
    }

    @Override
    public String createMail(String create) {

        return create;
    }

    @Override
    public void sendMail(String send) {
        System.out.println("Отправляем: " + send);
    }
}
