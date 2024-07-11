package ru.otus.drioma2002.java.basic.homeworks.homework1;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число (1 - 5):");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("\n" + choice + ") greetings:");
            greetings();

        } else if (choice == 2) {
            System.out.println("\n" + choice + ") checkSign:");

            int a = (int)(Math.random() * 10);
            int b = (int)(Math.random() * 10);
            int c = (int)(Math.random() * 10);

            if ((int)(Math.random() * 10) % 2 == 0) {
                a = a * -1;
            }

            if ((int)(Math.random() * 10) % 2 == 0) {
                b = b * -1;
            }

            if ((int)(Math.random() * 10) % 2 == 0) {
                c = c * -1;
            }

            checkSign(a, b, c);

        } else if (choice == 3) {
            System.out.println("\n" + choice + ") selectColor:");
            selectColor();

        } else if (choice == 4) {
            System.out.println("\n" + choice + ") compareNumbers:");
            compareNumbers();

        } else if (choice == 5) {
            System.out.println("\n" + choice + ") addOrSubtractAndPrint:");

            boolean increment;
            if ( (int)(Math.random() * 10) % 2 == 0 ) {
                increment = true;
            } else {
                increment = false;
            }

            addOrSubtractAndPrint((int)(Math.random() * 10), (int)(Math.random() * 10), increment);

        } else {
            System.out.println("Ошибка! Необходимо ввести число от 1 до 5, вы ввели: " + choice);
        }
    }

    // 1
    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    // 2
    public static void checkSign(int a, int b, int c) {
        int sum;

        sum = a + b + c;

        System.out.println("a = " + a + "; b = " + b + "; c = " + c + "; sum = " + sum);

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // 3
    public static void selectColor(){
        int data = 21;

        if (data <= 10) {
            System.out.println("Красный");
        } else if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // 4
    public static void compareNumbers() {
        int a = 5;
        int b = 7;

        System.out.println("a = " + a + "; b = " + b);

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // 5
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue + " + " +  delta + " = " + (initValue + delta));
        } else {
            System.out.println(initValue + " - " +  delta + " = " + (initValue - delta));
        }
    }
}
