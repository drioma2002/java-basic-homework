package ru.otus.drioma2002.java.basic.homeworks.homework5;

public class Dog extends Animal{
    public Dog(String name, float runSpeed, float swimSpeed, float endurance) {
        super(name, runSpeed, swimSpeed, endurance);
    }

    public float swim (int distance) {
        float time;
        // Собаки на 1 метр плавания тратят 2 ед. выносливости
        int distanceReal = distance;
        distance *= 2;

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
