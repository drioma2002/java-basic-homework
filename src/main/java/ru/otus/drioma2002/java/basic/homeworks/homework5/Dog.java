package ru.otus.drioma2002.java.basic.homeworks.homework5;

public class Dog extends Animal{
    public Dog(String name, float runSpeed, float swimSpeed, float endurance) {
        super(name, runSpeed, swimSpeed, endurance);
    }

    public float swim (int distance) {
        float time;

        System.out.println(name + " пытается проплыть " + distance + " м.");

        // Собаки на 1 метр плавания тратят 2 ед. выносливости
        int distanceReal = distance;
        distance *= 2;

        if (endurance - distance < 0) {
            System.out.println(name + " - Устал");
            return -1;
        }
        endurance -= distance;

        time = distance / runSpeed;

        System.out.println(name + " проплыл " + distanceReal + " м. за " + time + " сек.");

        return time;
    }
}
