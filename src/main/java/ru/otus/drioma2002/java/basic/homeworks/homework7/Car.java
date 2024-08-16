package ru.otus.drioma2002.java.basic.homeworks.homework7;

public class Car extends Vehicle {
    public Car(int fuel) {
        super("Машина", fuel, 1, new Terrain[]{Terrain.PLAIN});
    }
}
