package ru.otus.drioma2002.java.basic.homeworks.homework8;

public class AppArrayDataException extends RuntimeException {
        public AppArrayDataException(String message) {
            super("Неверные данные в ячейке массива " + message);
        }
}
