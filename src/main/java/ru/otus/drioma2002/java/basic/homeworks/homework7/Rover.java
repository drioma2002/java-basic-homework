package ru.otus.drioma2002.java.basic.homeworks.homework7;

public class Rover extends Vehicle {
    public Rover(int fuel) {
        super("Вездеход", fuel, 2, new Terrain[]{Terrain.PLAIN, Terrain.FOREST, Terrain.SWAMP});
    }
}

