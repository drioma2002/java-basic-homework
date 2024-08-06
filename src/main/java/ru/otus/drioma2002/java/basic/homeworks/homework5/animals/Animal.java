package ru.otus.drioma2002.java.basic.homeworks.homework5.animals;

public class Animal {
    protected String name;
    protected float runSpeed;     // (м/с)
    protected float swimSpeed;    // (м/с)
    protected float endurance;    // у.е.
    protected int energyRate = 0; // затраты энергии для плавания для каждого типа животного

    public Animal(String name, float runSpeed, float swimSpeed, float endurance) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.endurance = endurance;
    }

    // все животные на 1 метр бега тратят 1 ед. выносливости
    public float run (int distance) {

        System.out.println(name + " пытается пробежать " + distance + " м.");

        if (endurance - distance < 0) {
            System.out.println(name + " - Устал");
            endurance = 0;
            return -1;
        }
        endurance -= distance;

        float time = distance / runSpeed;

        System.out.println(name + " пробежал " + distance + " м. за " + time + " сек.");

        return time;
    }

    public float swim (int distance) {
        float time;

        System.out.println(name + " пытается проплыть " + distance + " м.");

        // Собаки на 1 метр плавания тратят 2 ед. выносливости
        int distanceReal = distance;
        distance *= energyRate;

        if (endurance - distance < 0) {
            System.out.println(name + " - Устал");
            return -1;
        }
        endurance -= distance;

        time = distance / runSpeed;

        System.out.println(name + " проплыл " + distanceReal + " м. за " + time + " сек.");

        return time;
    }

    public void info () {
        System.out.println();
        System.out.println("Имя: " + name);
        System.out.println("Скорость бега: " + runSpeed);
        System.out.println("Скорость плавания: " + swimSpeed);
        System.out.println("Выносливость: " + endurance);
        System.out.println();
    }
}
