package ru.otus.drioma2002.java.basic.homeworks.homework5.animals;

public class Horse extends Animal {
    public Horse(String name, float runSpeed, float swimSpeed, float endurance) {
        super(name, runSpeed, swimSpeed, endurance);
    }

    @Override
    public float swim (int distance) {
        // Лошади на 1 метр плавания тратят 4 ед. выносливости
        energyRate = 4;
        return super.swim(distance);
    }
}
