package com.company;

public class Main {

    public static void main(String[] args) {

        // oven реализация
        Oven oven = new Oven(4343, "Electrolux");
        System.out.println("Серийный номер духовки = ");  //??
        System.out.println("Бренд духовки: "); // ??
        oven.initTimer(120);
        oven.cook();
        oven.powerOff();
        System.out.println(" ");

        // dial phone реализация
        DialPhone dialPhone = new DialPhone(23243, "Phone", false);
        // как достать поля из конструктора или родительского класса???
        System.out.println("Серийный номер телефона = ");
        System.out.println("Бренд телефона: ");
        dialPhone.call();
        System.out.println("");

        // smart phone реализация
        SmartPhone smartPhone = new SmartPhone(345341, "нечто", 1, 4.4, "iOs");
        System.out.println("Телефон с ос - " + smartPhone.getOs());
        System.out.println("Размер дисплея = " + smartPhone.getDisplay());
        System.out.println("Количество симок = " + smartPhone.getSimCount());
        smartPhone.call();
        smartPhone.runApp();
        smartPhone.powerOff();
        System.out.println("");

        // multicook реализация
        Multicook multicook = new Multicook(786346, "Redmond");
        System.out.println("Мультиварка");
        multicook.switchProgram(3);
        multicook.cook();
        System.out.println("Что-то как-то приготовилось");
        multicook.powerOff();
        System.out.println("");

        // интерфейсы
        // интерфейс MailSender
        Post post = new Post();
        System.out.println(post.createMail("mail"));
        post.sendMail("mail");

        // интерфейс Caller
        DialPhone dialPh = new DialPhone(false);
        System.out.println(" ");

        // smartPhone интерфейс
        SmartPhone smPh = new SmartPhone(11141, "smart", 3, 6.4, "iOs");
        smPh.call();
        System.out.println(smartPhone.createMail("создаем письмо методом интерфейса"));
        System.out.println(smartPhone.editMail("редактируем письмо методом интерфейса"));
        smPh.sendMail("отправляем письмо методом интерфейса");
        System.out.println(" ");

        // отключаем все устройства
        offAll(oven, dialPhone, smartPhone, multicook);

        // рассылаем письма
        sendAll(post, smartPhone);
    }

    // метод для выключения всего п1
    public static void offAll(AbstractDevice... devices) {
        for (AbstractDevice device : devices) {
            device.powerOff();
            System.out.println(device);
            System.out.println(" ");
        }
    }

    // метод для выключения всего п2
    public static void sendAll(MailSender... devices) {
        for (MailSender device : devices) {
            device.sendMail("Рассылка");
            System.out.println(device);
            System.out.println(" ");
        }
    }
}


