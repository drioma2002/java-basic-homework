package ru.otus.drioma2002.java.basic.homeworks.homework19;

public class Homework19 {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        fruitBox.add(new Apple(1,1));
        fruitBox.add(new Apple(2,1));
        fruitBox.add(new Orange(3,2));
        System.out.println("Вес fruitBox = " + fruitBox.weight());

        appleBox.add(new Apple(1,1));
        appleBox.add(new Apple(2,1));
        appleBox.add(new Apple(3,1));
        appleBox.add(new Apple(4,1));
        System.out.println("Вес appleBox = " + appleBox.weight());

        orangeBox.add(new Orange(1,2));
        orangeBox.add(new Orange(2,2));
        orangeBox.add(new Orange(3,2));
        System.out.println("Вес orangeBox = " + orangeBox.weight());

        System.out.println("Вес fruitBox = appleBox? : " + fruitBox.compare(appleBox));
        System.out.println("Вес appleBox = orangeBox? : " + appleBox.compare(orangeBox));

        System.out.println("fruitBox = " + fruitBox);
        System.out.println("appleBox = " + appleBox);
        System.out.println("orangeBox = " + orangeBox);

        System.out.println("Пересыпаем appleBox -> fruitBox");
        appleBox.interlard(fruitBox);

        System.out.println("fruitBox = " + fruitBox);
        System.out.println("appleBox = " + appleBox);
        System.out.println("orangeBox = " + orangeBox);

        System.out.println("Пересыпаем orangeBox -> fruitBox");
        orangeBox.interlard(fruitBox);

        System.out.println("fruitBox = " + fruitBox);
        System.out.println("appleBox = " + appleBox);
        System.out.println("orangeBox = " + orangeBox);
    }
}
