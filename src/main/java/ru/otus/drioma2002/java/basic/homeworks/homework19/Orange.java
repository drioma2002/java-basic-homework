package ru.otus.drioma2002.java.basic.homeworks.homework19;

public class Orange extends Fruit {
    private int id;

    public Orange(int id, int weight) {
        super(weight);
        this.id = id;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "id='" + id + "\', " +
                "weight='" + this.getWeight() + '\'' +
                '}';
    }
}
