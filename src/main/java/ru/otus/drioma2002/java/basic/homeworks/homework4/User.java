package ru.otus.drioma2002.java.basic.homeworks.homework4;

public class User {
    private String surname;
    private String name;
    private String patronymic;
    private int birthYear;
    private String email;

    // Конструктор:
    public User (String surname, String name, String patronymic, int birthYear, String email) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthYear = birthYear;
        this.email = email;
    }

    public void printInfo () {
        System.out.println("ФИО: " + surname + " " + name + " " + patronymic);
        System.out.println("Год рождения: " + birthYear);
        System.out.println("e-mail: " + email);
        System.out.println();
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getEmail() {
        return email;
    }
}
