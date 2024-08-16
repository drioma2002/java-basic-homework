package ru.otus.drioma2002.java.basic.homeworks.homework7;

public class Horse extends Vehicle {
    public Horse(int health) {
        super("Лошадь", health, 2, new Terrain[]{Terrain.PLAIN, Terrain.FOREST});
    }
}
