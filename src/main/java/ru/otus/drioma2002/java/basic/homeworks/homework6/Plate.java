package ru.otus.drioma2002.java.basic.homeworks.homework6;

public class Plate {
    private final int maxFood;
    private int currFood;

    public Plate(int maxFood) {
        this.maxFood = maxFood;
        this.currFood = maxFood;
    }

    public void addFood (int qty) {

        System.out.print("Добавляем " + qty + " ед. еды в тарелку: ");

        if ( qty <= 0 ) {
            System.out.println("количество еды должно быть положительным");
            return;
        }

        if (currFood + qty > maxFood) {
            System.out.println("нельзя добавить еды больше максимума. Можно добавить: " + (maxFood - currFood));
            return;
        }
        System.out.println("в тарелку добавлено: " + qty);

        currFood += qty;
    }

    public boolean decrease (int qty) {
        if ( qty <= 0 ) {
            System.out.println("Количество еды должно быть положительным");
            return false;
        }
        if ( currFood - qty < 0 ) {
            System.out.println("В тарелке недостаточно еды. Доуступно: " + currFood);
            return false;
        }

        currFood -= qty;
        return true;
    }

    public void info () {
        System.out.println("Тарелка максимум: " + maxFood + " остаток: " + currFood);
    }
}
