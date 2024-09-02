package ru.otus.drioma2002.java.basic.homeworks.homework9;

public class Employee {
    private final String name;
    private final int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void printInfo () {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }
}
