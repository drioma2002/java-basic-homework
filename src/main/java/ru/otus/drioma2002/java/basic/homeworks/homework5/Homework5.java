package ru.otus.drioma2002.java.basic.homeworks.homework5;

import ru.otus.drioma2002.java.basic.homeworks.homework5.animals.Cat;
import ru.otus.drioma2002.java.basic.homeworks.homework5.animals.Dog;
import ru.otus.drioma2002.java.basic.homeworks.homework5.animals.Horse;

public class Homework5 {
    public static void main(String[] args) {
        float time;         //секунды

        // Собака:
        Dog dog = new Dog("Шарик", 4f, 0.5f,100f);

        dog.info();
        time = dog.run(80);
        dog.info();
        time = dog.swim(10);
        dog.info();
        time = dog.run(1);
        dog.info();

        // Лошадь:
        Horse horse = new Horse("Афина", 20f, 2, 1000f);

        horse.info();
        time = horse.run(920);
        horse.info();
        time = horse.swim(10);
        horse.info();
        time = horse.swim(11);
        horse.info();

        // Кот:
        Cat cat = new Cat("Барсик", 12f,  10f);

        cat.info();
        time = cat.run(6) ;
        cat.info();
        time = cat.run(5) ;
        cat.info();

    }
}
