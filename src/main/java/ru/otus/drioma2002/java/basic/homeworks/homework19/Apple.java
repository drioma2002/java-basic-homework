package ru.otus.drioma2002.java.basic.homeworks.homework19;

public class Apple extends Fruit {
    private int id;

    public Apple(int id, int weight) {
        super(weight);
        this.id = id;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "id='" + id+ "\', " +
                "weight='" + this.getWeight() + '\'' +
                '}';
    }
}
