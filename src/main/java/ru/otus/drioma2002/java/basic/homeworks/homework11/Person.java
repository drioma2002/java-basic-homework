package ru.otus.drioma2002.java.basic.homeworks.homework11;

public class Person {
    private final String name;
    private final Position position;
    private final Long id;

    public Person(String name, Position position, Long id) {
        this.name = name;
        this.position = position;
        this.id = id;
    }

    public Position getPosition() {
        return position;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name + ", " +
                "position=" + position + ", " +
                "id=" + id +
                "}";
    }
}
