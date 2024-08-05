package ru.otus.drioma2002.java.basic.homeworks.homework5;

public class Animal {
    private String name;
    private float runSpeed;     // (м/с)
    private float swimSpeed;    // (м/с)
    private float endurance;    // у.е.

    public Animal(String name, float runSpeed, float swimSpeed, float endurance) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.endurance = endurance;
    }

    // все животные на 1 метр бега тратят 1 ед. выносливости
    public float run (int distance) {
        float time;
        if (endurance - distance < 0) {
            System.out.println(name + " - Устал");
            return -1;
        }
        endurance -= distance;

        time = distance / runSpeed;

        System.out.println(name + " пробежал " + distance + " м. за " + time + " сек.");

        return time;
    }

    public void info () {
        System.out.println();
        System.out.println("Имя: " + name);
        System.out.println("Скорость бега: " + runSpeed);
        System.out.println("Скорость плавания: " + swimSpeed);
        System.out.println("Выносливость: " + endurance);
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public float getRunSpeed() {
        return runSpeed;
    }

    public float getSwimSpeed() {
        return swimSpeed;
    }

    public float getEndurance() {
        return endurance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRunSpeed(float runSpeed) {
        this.runSpeed = runSpeed;
    }

    public void setSwimSpeed(float swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public void setEndurance(float endurance) {
        this.endurance = endurance;
    }
}
