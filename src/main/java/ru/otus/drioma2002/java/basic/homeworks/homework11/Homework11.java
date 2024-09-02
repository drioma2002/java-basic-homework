package ru.otus.drioma2002.java.basic.homeworks.homework11;

/*
Даны класс Person и enum Position

public class Person {
   String name;
   Position position;
   Long id;
}

public enum Position {
 MANAGER, DIRECTOR, DRIVER, ENGINEER, SENIOR_MANAGER, DEVELOPER, QA,
 JANITOR, PLUMBER, BRANCH_DIRECTOR, JUNIOR_DEVELOPER
}


Реализуйте класс PersonDataBase, содержащий список Person, и имеющий методы, со следующей асимптотической сложностью (методы и конструктор класса Person реализовать самостоятельно)

- Person findById(Long id) - найти Person по id - O(1)
- void add(Person person) - добавить Person - O(1)
- isManager(Person person) - O(1) - true если Position : MANAGER, DIRECTOR, BRANCH_DIRECTOR или SENIOR_MANAGER
- isEmployee(Long id) - O(1) - true если Employee имеет любой другой Position
 */

public class Homework11 {
    public static void main(String[] args) {
        PersonDataBase dataBase = new PersonDataBase();
        dataBase.add(new Person("Иван", Position.DIRECTOR, 1L));
        dataBase.add(new Person("Мария", Position.SENIOR_MANAGER, 2L));
        dataBase.add(new Person("Петр", Position.MANAGER, 3L));
        dataBase.add(new Person("Василий", Position.ENGINEER, 4L));
        dataBase.add(new Person("Ирина", Position.JANITOR, 5L));

        System.out.println(dataBase);

        System.out.println();

        System.out.println(dataBase.findById(2L));
        System.out.println(dataBase.findById(999L));

        System.out.println();

        System.out.println(dataBase.findById(1L) + " isManager = " + dataBase.isManager(dataBase.findById(1L)));
        System.out.println(dataBase.findById(4L) + " isManager = " + dataBase.isManager(dataBase.findById(4L)));

        System.out.println();

        System.out.println(dataBase.findById(5L) + " isEmployee = " + dataBase.isEmployee(5L));
        System.out.println(dataBase.findById(2L) + " isEmployee = " + dataBase.isEmployee(2L));

    }
}
