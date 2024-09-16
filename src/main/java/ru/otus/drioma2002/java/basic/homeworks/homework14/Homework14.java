package ru.otus.drioma2002.java.basic.homeworks.homework14;

public class Homework14 {

    public static void main(String[] args) throws InterruptedException {
        int arrSize = 100_000_000;
        long startTime;
        long endTime;

        startTime = System.currentTimeMillis();
        fillArr(new Double[arrSize], 0, arrSize);
        endTime = System.currentTimeMillis();

        System.out.println("Время выполнения в однопоточном режиме: " + toSecond((double) (endTime - startTime)) + " сек." );

        startTime = System.currentTimeMillis();
        fillMultiThreads(new Double[arrSize],4);
        endTime = System.currentTimeMillis();

        System.out.println("Время выполнения в многопоточном режиме: " + toSecond((double) (endTime - startTime)) + " сек." );
    }

    public static void fillMultiThreads(Double[] arr, int threadsNumber) throws InterruptedException {

        if ((double) arr.length % threadsNumber != 0) {
            System.out.println("Ошибка: массив размером " + arr.length + " нельзя разбить на " + threadsNumber +" потока");
            return;
        };

        Thread[] threads = new Thread[threadsNumber];
        int qtyPerThread = arr.length / threadsNumber;

        for (int i = 0; i < threadsNumber; i++) {
            int start = i * qtyPerThread;
            int end = (i + 1) * qtyPerThread;

            threads[i] = new Thread(() -> fillArr(arr, start, end));
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }
    }

    public static void fillArr (Double[] arr, int start, int end) {
        for (int i = start; i < end; i++) {
            arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
//            System.out.println(Thread.currentThread().getName() + " " + arr[i]);
        }
    }

    public static double toSecond (Double ms) {
        return (ms / 1000) % 60;
    }
}
