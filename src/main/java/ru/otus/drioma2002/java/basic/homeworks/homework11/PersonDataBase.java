package ru.otus.drioma2002.java.basic.homeworks.homework11;

import java.util.Map;
import java.util.HashMap;

public class PersonDataBase {
    private final Map<Long, Person> personList;

    public PersonDataBase() {
        this.personList = new HashMap<>();
    }

    public void add(Person person) {
        personList.put(person.getId(), person);
    }

    public Person findById(Long id) {
        return personList.getOrDefault(id, null);
    }

    public boolean isManager(Person person) {
        return person.getPosition().isManager();
    }

    public boolean isEmployee(Long id) {
        return !isManager(findById(id));
    }

    @Override
    public String toString() {
        return "PersonDataBase{\r\n" +
                "personList=" + personList +
                "\r\n}";
    }
}
