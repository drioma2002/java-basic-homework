package ru.otus.drioma2002.java.basic.homeworks.homework6;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false; // сытость

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if (satiety) {
            System.out.println("Кот " + name + " сыт");
            return;
        }

        System.out.println("Кот " + name + " кушает");

        if ( plate.decrease(appetite) ) {
            System.out.println(name + " - наелся");
            satiety = true;
        } else {
            System.out.println(name + " - голоден");
            satiety = false;
        }

    }

    public void info () {
        System.out.println("Кот " + name + " аппетит: " + appetite + " сыт: " + satiety);
    }
}
