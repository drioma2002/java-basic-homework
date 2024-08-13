package ru.otus.drioma2002.java.basic.homeworks.homework7;

public class Homework7 {
    public static void main(String[] args) {

        Human human = new Human("Василий", 100);
        human.getOut();

        System.out.println();

        human.printInfo();
        Car car = new Car(100);
        car.printInfo();
        human.getIn(car);
        human.move(Terrain.FOREST, 10); // Местность, по которой машина не может ехать
        human.move(Terrain.PLAIN, 10);
        human.getOut();
        car.printInfo();
        human.printInfo();

        System.out.println();

        human.move(Terrain.FOREST, 10);
        human.printInfo();

        System.out.println();

        human.printInfo();
        Bike bike = new Bike(human);
        bike.printInfo();
        human.getIn(bike);
        human.move(Terrain.PLAIN, 25);
        bike.printInfo();
        human.getOut();
        human.printInfo();

        System.out.println();

        Rover rover = new Rover(500);
        rover.printInfo();
        human.getIn(rover);
        human.move(Terrain.SWAMP, 40);
        rover.printInfo();
        human.getOut();
        human.printInfo();

        System.out.println();

        Horse horse = new Horse(200);
        horse.printInfo();
        human.getIn(horse);
        human.move(Terrain.FOREST,90);
        horse.printInfo();
        human.getOut();
        human.printInfo();
    }
}
