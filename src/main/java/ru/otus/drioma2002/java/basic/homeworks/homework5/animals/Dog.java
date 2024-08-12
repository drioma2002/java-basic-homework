package ru.otus.drioma2002.java.basic.homeworks.homework5.animals;

public class Dog extends Animal {
    public Dog(String name, float runSpeed, float swimSpeed, float endurance) {
        super(name, runSpeed, swimSpeed, endurance);
        // Собаки на 1 метр плавания тратят 2 ед. выносливости
        this.energyRate = 2;
    }
}
