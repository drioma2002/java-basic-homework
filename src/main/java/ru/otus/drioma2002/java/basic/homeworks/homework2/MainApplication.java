package ru.otus.drioma2002.java.basic.homeworks.homework2;

import java.util.Arrays;

public class MainApplication {
    public static void main(String[] args) {
        // Задание 1
        //repeatText(5, "Text to repeate");

        // Задание 2
        //sumMoreThan5(new int[]{3, 4, 5, 6, 7, 8});

        // Задание 3
        //fillArray(7, new int[5]);

        // Задание 4
        //increaseArrayValues(2, new int[]{1, 2, 3, 4, 5});

        // Задание 5
        //arrPartsCompare(new int[]{1, 2, 3, 4, 5, 6});
    }

    // Задание 1
    public static void repeatText(int repTime, String repText){
        for (int i = 0; i < repTime; i++) {
            System.out.println(repText);
        }
    }

    // Задание 2
    public static void sumMoreThan5(int[] arr){
        int sum = 0;

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5 ){
                sum += arr[i];
            }
        }

        System.out.println("Сумма элементов массива больше пяти = " + sum);
    }

    // Задание 3
    public static void fillArray(int num, int[] arr){

        System.out.println("До заполнения: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            arr[i] = num;
        }

        System.out.println("После заполнения: " + Arrays.toString(arr));
    }

    // Задание 4
    public static void increaseArrayValues(int num, int[] arr){

        System.out.println("До увеличения эл-тов массива: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            arr[i] += num;
        }

        System.out.println("После увеличения эл-тов массива: " + Arrays.toString(arr));
    }

    // Задание 5
    public static void arrPartsCompare(int[] arr){
        int sum1 = 0;
        int sum2 = 0;

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            //System.out.println(i + " " + arr.length);
            if (i < arr.length / 2) {
                sum1 += arr[i];
            } else {
                sum2 += arr[i];
            }
        }

        if (sum1 > sum2){
            System.out.println("левая (" + sum1 + ") половина больше правой (" + sum2 +")");
        } else if (sum1 < sum2) {
            System.out.println("правая (" + sum2 + ") половина больше левой (" + sum1 +")");
        } else {
            System.out.println("левая (" + sum1 + ") и правая (" + sum2 +") половины равны");
        }

    }
}
