package ru.otus.drioma2002.java.basic.homeworks.homework5;

public class Horse extends Animal {
    public Horse(String name, float runSpeed, float swimSpeed, float endurance) {
        super(name, runSpeed, swimSpeed, endurance);
    }

    public float swim (int distance) {
        float time;

        System.out.println(name + " пытается проплыть " + distance + " м.");

        // Лошади на 1 метр плавания тратят 4 ед. выносливости
        int distanceReal = distance;
        distance *= 4;

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
