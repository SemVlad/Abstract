package com.company;

public class Post implements MailSender {

    @Override
    public String createMail(String create) {
        System.out.print("Создаем письмо: ");
        return create;
    }

    @Override
    public void sendMail(String send) {
        System.out.println("Отправляєм : " + send);
    }
}
