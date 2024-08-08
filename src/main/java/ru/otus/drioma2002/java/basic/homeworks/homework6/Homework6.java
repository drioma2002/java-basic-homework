package ru.otus.drioma2002.java.basic.homeworks.homework6;

public class Homework6 {
    public static void main(String[] args) {
        Plate plate = new Plate(24);

        Cat[] cat = {
                new Cat("Барсик", 10),
                new Cat("Мурзик", 15),
                new Cat("Пушок", 5)
        };


        for (int i = 0; i < cat.length; i++) {
            plate.info();
            cat[i].info();
            cat[i].eat(plate);
            cat[i].info();
            plate.info();

            System.out.println();
        }

        System.out.println("----------------");

        // проверим добавление еды в тарелку:
        plate.addFood(25); // слишком много еды для тарелки
        System.out.println();

        plate.addFood(15); // количество еды, которое влазит в тарелку

        plate.info();

    }
}
