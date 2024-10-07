package ru.otus.drioma2002.java.basic.homeworks.homework21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Homework21 {
    private final Object mon = new Object();
    private char currentLetter = 'A';

    public static void main(String[] args) {
        Homework21 homework21 = new Homework21();

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.execute(() -> homework21.printLetter('A'));
        executorService.execute(() -> homework21.printLetter('B'));
        executorService.execute(() -> homework21.printLetter('C'));

        executorService.shutdown();
    }

    private void printLetter(char letter) {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentLetter != letter) {
                        mon.wait();
                    }

                    System.out.print(letter);

                    currentLetter = nextLetter(letter);
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private char nextLetter(char letter) {
        if (letter == 'A') {
            return 'B';
        } else if (letter == 'B') {
            return 'C';
        } else if (letter == 'C') {
            return 'A';
        } else {
            throw new RuntimeException("буква " + letter + " не поддерживается");
        }
    }

}
