package ru.otus.drioma2002.java.basic.homeworks.homework9;

import java.util.ArrayList;

public class Homework9 {
    public static void main(String[] args) {
        // Задание 1
        // Реализуйте метод, принимающий в качестве аргументов числа min и max, и возвращающий ArrayList
        // с набором последовательных значений в указанном диапазоне (min и max включительно, шаг - 1);
        System.out.println("Задание 1");
        System.out.println(generateRange(-5, 5));

        // Задание 2
        // Реализуйте метод, принимающий в качестве аргумента список целых чисел, суммирующий все элементы,
        // значение которых больше 5, и возвращающий сумму;
        System.out.println("Задание 2");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3); list.add(4); list.add(5); list.add(6); list.add(7);
        System.out.println(sumIsGreaterThanFive(list));

        // Задание 3
        // Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список,
        // метод должен переписать каждую заполненную ячейку списка указанным числом;
        System.out.println("Задание 3");
        list.clear();

        list.add(5); list.add(4); list.add(3); list.add(2); list.add(1);

        System.out.println(list);
        System.out.println(replaceListVal(7, list));

        // Задание 4
        // Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список,
        // увеличивающий каждый элемент списка на указанное число;
        System.out.println("Задание 4");
        list.clear();

        list.add(10); list.add(11); list.add(12); list.add(13); list.add(14);
        System.out.println(list);
        System.out.println(increaseByVal(5, list));

        // Задание 5.1
        // Создайте класс Сотрудник с полями: имя, возраст;
        // Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий список их имен;
        System.out.println("Задание 5.1");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Андрей", 40));
        employees.add(new Employee("Василий", 36));
        employees.add(new Employee("Иван", 50));
        employees.add(new Employee("Мария", 47));

        System.out.println(getEmployeeName(employees));

        // Задание 5.2
        // Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный возраст,
        // и возвращающий список сотрудников, возраст которых больше либо равен указанному аргументу;
        System.out.println("Задание 5.2");

        for (Employee e : getEmployeesOlderThanAge(employees, 41)) {
            e.printInfo();
        }

        // Задание 5.3
        // Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный средний возраст,
        // и проверяющий что средний возраст сотрудников превышает указанный аргумент;
        System.out.println("Задание 5.3");
        System.out.println("Средний возраст сотрудников превыщает аргумент: " + isAvgAgeEmployeersMoreThan(employees, 43));

        // Задание 5.4
        // Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий ссылку на самого молодого сотрудника.
        System.out.println("Задание 5.4");
        System.out.println("Самый молодой сотрудник: " + getYoungestEmployeer(employees));
    }

    // Задание 1
    public static ArrayList<Integer> generateRange (Integer min, Integer max) {
        if (min > max) {
            System.out.println("Ошибка: min > max");
            return null;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            list.add(i);
        }
        return list;
    }

    // Задание 2
    public static Integer sumIsGreaterThanFive(ArrayList<Integer> list) {
        Integer sum = 0;

        for (Integer l : list) {
            if (l > 5) {
                sum += l;
            }
        }

        return sum;
    }

    // Задание 3
    public static ArrayList<Integer> replaceListVal (Integer val, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, val);
        }
        return list;
    }

    // Задание 4
    public static ArrayList<Integer> increaseByVal (Integer val, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + val);
        }
        return list;
    }

    // Задание 5.1
    public static ArrayList<String> getEmployeeName (ArrayList<Employee> list) {
        ArrayList listName = new ArrayList<>();
            for (Employee e : list) {
                listName.add(e.getName());
            }
        return listName;
    }

    // Задание 5.2
    public static ArrayList<Employee> getEmployeesOlderThanAge(ArrayList<Employee> list, int age) {
        ArrayList<Employee> employeesOlderThan = new ArrayList<>();
        for (Employee e : list) {
            if (e.getAge() >= age) {
                employeesOlderThan.add(e);
            }
        }
        return employeesOlderThan;
    }

    // Задание 5.3
    public static boolean isAvgAgeEmployeersMoreThan (ArrayList<Employee> list, float minAvgAge) {
        int sumAge = 0;
        int count = 0;

        for (Employee e : list) {
            sumAge += e.getAge();
            count ++;
        }

        return (float) sumAge / count > minAvgAge;
    }

    // Задание 5.4
    public static String getYoungestEmployeer (ArrayList<Employee> list) {
        Employee youngestEmployeer = list.get(0);

        for (Employee e : list) {
            if (e.getAge() < youngestEmployeer.getAge()) {
                youngestEmployeer = e;
            }
        }

        return youngestEmployeer.getName();
    }
}
