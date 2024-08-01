package ru.otus.drioma2002.java.basic.homeworks.homework4;

import java.time.Year;

public class Main {
    public static void main(String[] args) {
        User[] users = {
                new User("Иванов", "Иван", "Иванович", 1980, "ivanov@mail.ru"),
                new User("Петров", "Петр", "Петрович", 1984, "petrov@mail.ru"),
                new User("Скворцова", "Ирина", "Ивановна", 1979, "skvortsova@mail.ru"),
                new User("Краснов", "Сергей", "Иванович", 1990, "krasnov@mail.ru"),
                new User("Сидоров", "Кирилл", "Андреевич", 1983, "sidorov@mail.ru"),
                new User("Соколова", "Светлана", "Сергеевна", 1982, "sokolova@mail.ru"),
                new User("Серов", "Владимир", "Витальевич", 1995, "serov@mail.ru"),
                new User("Москвина", "Ирина", "Геннадьевна", 1978, "moskvina@mail.ru"),
                new User("Алешкин", "Юрий", "Алексеевич", 1989, "aleshkin@mail.ru"),
                new User("Перевалова", "Галина", "Сергеевна", 1978, "perevalova@mail.ru")

        };


        int currentYear = Year.now().getValue();

        for (int i = 0; i < users.length; i++) {
            if ( currentYear - users[i].getBirth_year() > 40 ) {
                users[i].printInfo();
            }
        }
    }
}
