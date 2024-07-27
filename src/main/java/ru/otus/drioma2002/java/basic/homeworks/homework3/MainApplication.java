package ru.otus.drioma2002.java.basic.homeworks.homework3;

public class MainApplication {

    public static void main(String[] args) {

//        // Задание 1
//        int[][] arr2d = {{-1, 2, -3}, {4, -5, 6}, {-7, 8, -9}};
//        printArr(arr2d);
//        System.out.println("Сумма эл-тов массива больше нуля = " + sumOfPositiveElements(arr2d));

//        // Задание 2
//        printSquare(5);

//        // Задание 3
//        int[][] arr = {{5, 5, 5, 5, 5}, {5, 5, 5, 5, 5}, {5, 5, 5, 5, 5}, {5, 5, 5, 5, 5}, {5, 5, 5, 5, 5}};
//        diagonalNulling(arr);
//        printArr(arr);

//        // Задание 4
//        int[][] arr = {{-4, -3, -2}, {-1, -5, -4}, {-3, -2, -1}};
//        printArr(arr);
//        System.out.println("Максимальный элемент массива = " + findMax(arr));

//        // Задание 5
//        int[][] arr = { {1, 2, 3},  {4, 5, 6} ,  {7, 8, 9} };
//        printArr(arr);
//        System.out.println("Сумма элементов второй строки массива = " + sumSecondRow(arr));


    }

    // Задание 1
    public static int sumOfPositiveElements(int[][] arr2d) {

        int sum = 0;

        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                if (arr2d[i][j] > 0) {
                    sum += arr2d[i][j];
                }
            }
        }

        return sum;
    }

    // Задание 2
    public static void printSquare(int size) {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ( i == 0 || i == size-1 || j == 0 || j == size-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    // Задание 3
    public static void diagonalNulling(int [][] arr) {

        for (int i = 0; i < arr.length; i++) {
                arr[i][i] = 0;
                arr[i][arr.length-1 - i] = 0;
        }

    }

    // Задание 4
    public static int findMax(int[][] array){
        int max;

        max = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ( array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }

        return max;
    }

    // Задание 5
    public static int sumSecondRow(int[][] arr){
        int sum = 0;

        if (arr.length < 2) {
            return -1;
        }

        for (int i = 0; i < arr[1].length; i++) {
            sum += arr[1][i];
        }

        return sum;
    }

    // вспомогательный метод для печати массива
    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print( arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
