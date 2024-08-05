package ru.otus.drioma2002.java.basic.homeworks.homework5;

public class Horse extends Animal {
    public Horse(String name, float runSpeed, float swimSpeed, float endurance) {
        super(name, runSpeed, swimSpeed, endurance);
    }

    public float swim (int distance) {
        float time;
        // Лошади на 1 метр плавания тратят 4 ед. выносливости
        int distanceReal = distance;
        distance *= 4;

        if (super.getEndurance() - distance < 0) {
            System.out.println(super.getName() + " - Устал");
            return -1;
        }
        super.setEndurance(super.getEndurance() - distance);

        time = distance / super.getRunSpeed();

        System.out.println(super.getName() + " проплыл " + distanceReal + " м. за " + time + " сек.");

        return time;
    }
}
