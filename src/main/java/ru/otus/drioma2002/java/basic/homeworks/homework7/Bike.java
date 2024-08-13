package ru.otus.drioma2002.java.basic.homeworks.homework7;

public class Bike extends Vehicle {
    public Bike(Human human) {
        super("Велосипед", human, 2, new Terrain[]{Terrain.PLAIN, Terrain.FOREST});
    }
}
