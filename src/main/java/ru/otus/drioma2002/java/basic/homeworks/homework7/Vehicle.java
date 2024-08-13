package ru.otus.drioma2002.java.basic.homeworks.homework7;

public abstract class Vehicle implements Moveable {
    String type;
    int power;
    int powerСonsumption;
    Terrain[] allowableTerrain;
    Human human;

    public Vehicle(String type, int power, int powerСonsumption, Terrain[] allowableTerrain) {
        this.type = type;
        this.power = power;
        this.powerСonsumption = powerСonsumption;
        this.allowableTerrain = allowableTerrain;
    }

    public Vehicle(String type, Human human, int powerСonsumption, Terrain[] allowableTerrain) {
        this.type = type;
        this.power = human.getPower();
        this.powerСonsumption = powerСonsumption;
        this.allowableTerrain = allowableTerrain;

        this.human = human;
    }

    @Override
    public boolean move(Terrain terrain, int distance) {
        for (Terrain t : allowableTerrain) {
            if (t == terrain) {
                if (power < distance * powerСonsumption) {
                    power = 0;
                    System.out.println(type + " недостаточно топлава/энергии");
                    renewHumanPower();
                    return false;
                }

                power -= distance * powerСonsumption;
                System.out.println(type + " проехала расстояние " + distance + " коэф. потребления топлива/энергии " + powerСonsumption);
                renewHumanPower();
                return true;
            }
        }
        System.out.println(type + " не может ехать по " + terrain);
        return false;
    }

    @Override
    public void printInfo() {
        System.out.println(type + " осталось топлава/энергии " + power);
    }

    public String getType() {
        return type;
    }

    private void renewHumanPower(){
        if (human != null) {
            human.setPower(power);
        }
    }
}
