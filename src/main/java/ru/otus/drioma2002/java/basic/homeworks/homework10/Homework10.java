package ru.otus.drioma2002.java.basic.homeworks.homework10;

public class Homework10 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иван", "+7(978)7-000-111");
        phoneBook.add("Татьяна", "+7(978)7-000-222");
        phoneBook.add("Татьяна", "+7(978)7-000-333");
        phoneBook.add("Татьяна", "+7(978)7-000-444");

        phoneBook.find("Иван");
        phoneBook.find("Татьяна");
        phoneBook.find("Виктор");

        phoneBook.containsPhoneNumber("+7(978)7-000-333");
        phoneBook.containsPhoneNumber("+7(978)7-000-555");
    }
}
