package ru.otus.drioma2002.java.basic.homeworks.homework8;

public class AppArraySizeException extends RuntimeException {
        public AppArraySizeException(String message) {
            super("Массив должен иметь размер " + message);
        }
}
