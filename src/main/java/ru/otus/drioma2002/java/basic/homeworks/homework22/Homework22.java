package ru.otus.drioma2002.java.basic.homeworks.homework22;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class Homework22 {
    private static final Logger LOGGER = LogManager.getLogger(Homework22.class.getName());

    public static void main(String[] args) {
        int[] arr;

        arr = new int[]{1, 2, 3, 1, 4, 5, 6};
        LOGGER.info("Возврат массива после последней 1, на вход: " + Arrays.toString(arr) + " на выход: " +  Arrays.toString(arrAfterLastOneEntry(arr)));

        arr = new int[]{1, 1, 2};
        LOGGER.info("Массив должен содержать только 1 и 2, на вход: " + Arrays.toString(arr) + " на выход: " +  arrContainsOneAndTwoOnly(arr));

        arr = new int[]{1, 1, 1};
        LOGGER.info("Массив должен содержать только 1 и 2, на вход: " + Arrays.toString(arr) + " на выход: " +  arrContainsOneAndTwoOnly(arr));

    }

    public static int[] arrAfterLastOneEntry (int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 1) {
                int[] arrResult = new int[arr.length - i - 1];
                System.arraycopy(arr, i + 1, arrResult, 0, arr.length - i - 1);
                return arrResult;
            }
        }
        throw new RuntimeException("В массиве нет элемента 1");
    }

    public static boolean arrContainsOneAndTwoOnly (int[] arr) {
        boolean onePresent = false;
        boolean twoPresent = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1 && arr[i] != 2) {
                return false;
            }

            if (arr[i] == 1) {
                onePresent = true;
            } else {
                twoPresent = true;
            }
        }
        return onePresent && twoPresent;
    }
}