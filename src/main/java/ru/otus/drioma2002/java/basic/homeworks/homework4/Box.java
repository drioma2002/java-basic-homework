package ru.otus.drioma2002.java.basic.homeworks.homework4;

public class Box {
    private String color;
    private int height;
    private int width;
    private int depth;
    private String content;
    private boolean isOpen = false;

    // Конструктор:
    public Box (String color, int height, int width, int depth) {
        this.color = color;
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public void printInfo () {
        System.out.print("Инфо: Цвет: " + color + " Размер: " + height + "x" + width + "x" + depth + " Содержимое: ");

        if (content == null) {
            System.out.print("пусто");
        } else {
            System.out.print(content);
        }

        if (isOpen) {
            System.out.println(" Состояние: открыта");
        } else {
            System.out.println(" Состояние: закрыта");
        }
    }

    public void open() {
        if (isOpen) {
            System.out.println("Ошибка: Коробка уже открыта!");
            return;
        }
        isOpen = true;
        System.out.println("Коробка открыта");
    }

    public void close() {
        if (!isOpen) {
            System.out.println("Ошибка: Коробка уже закрыта!");
            return;
        }
        isOpen = false;
        System.out.println("Коробка закрыта");
    }

    public void putItem (String item) {
        if (!isOpen) {
            System.out.println("Ошибка: коробка закрыта!");
            return;
        }

        if (content != null) {
            System.out.println("Ошибка: В коробке уже лежит " + content + " !");
            return;
        }

        content = item;
        System.out.println("В коробку положили " + content);
    }

    public void eject () {
        if (!isOpen) {
            System.out.println("Ошибка: коробку нельзя вытряхнуть, коробка закрыта!");
            return;
        }

        if ( content == null ) {
            System.out.println("Ошибка: Коробка пустая!");
            return;
        }
        content = null;
        System.out.println("Коробку вытряхнули. Коробка пустая.");
    }

    public void setColor(String color) {
        this.color = color;
    }

}
