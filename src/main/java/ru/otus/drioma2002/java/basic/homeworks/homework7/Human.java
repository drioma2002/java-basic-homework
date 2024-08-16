package ru.otus.drioma2002.java.basic.homeworks.homework7;

public class Human implements Moveable {
    private String name;
    private int power;
    private Vehicle currentTransport;

    public Human(String name, int power) {
        this.name = name;
        this.power = power;
        this.currentTransport = null;
    }

    public void getIn (Vehicle vehicle) {
        if (isOnVehicle()) {
            System.out.println(name + " уже находится на " + currentTransport.getType());
            return;
        }
        currentTransport = vehicle;
        System.out.println(name + " сел на " + currentTransport.getType());
    }

    public void getOut () {
        if (!isOnVehicle()) {
            System.out.println(name + " не находится на транспортном средстве");
            return;
        }

        System.out.println(name + " вышел из " + currentTransport.getType());
        currentTransport = null;
    }

    private boolean isOnVehicle () {
        return currentTransport != null;
    }

    @Override
    public boolean move(Terrain terrain, int distance) {
        if (isOnVehicle()){
            // если находимся на транспорте - едем на нем
            return currentTransport.move(terrain, distance);
        } else {
            // если нет - идем ногами
            if (power < distance) {
                power = 0;
                System.out.println(name + " устал");
                return false;
            }

            power -= distance;
            System.out.println(name + " прошел расстояние = " + distance);
            return true;
        }
    }

    @Override
    public void printInfo() {
        System.out.println(name + " остаток сил " + getPower());
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
