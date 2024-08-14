package ru.otus.drioma2002.java.basic.homeworks.homework8;

public class Homework8 {
    public static void main(String[] args) {
        String[][] arr = {
                {"1",   "2",  "3", "4"},
                {"5",   "6",  "7", "8"},
                {"9",  "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            System.out.println("Сумма элементов массива: " + sumArr2d(arr));
        } catch (AppArraySizeException | AppArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int sumArr2d (String[][] arr){
        int arrSize = 4;
        int sum = 0;

            if (arr.length != arrSize) {
                throw new AppArraySizeException(arrSize + "x" + arrSize);
            }

            for (int i = 0; i < arr.length; i++) {

                if (arr[i].length != arrSize) {
                    throw new AppArraySizeException(arrSize + "x" + arrSize);
                }

                for (int j = 0; j < arr[i].length; j++) {
                    try {
                        sum += Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException e) {
                        throw new AppArrayDataException(i + ":" + j);
                    }
                }
            }

        return sum;
    }
}
