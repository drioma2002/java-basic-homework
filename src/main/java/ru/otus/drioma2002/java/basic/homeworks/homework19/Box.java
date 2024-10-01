package ru.otus.drioma2002.java.basic.homeworks.homework19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Box <T extends Fruit> {
    private final List<T> fruits = new ArrayList<>();

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public int weight() {
        int totalWeight = 0;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public boolean compare(Box<?> compareWithBox) {
        return weight() == compareWithBox.weight();
    }

    public List<T> getFruits() {
        return fruits;
    }

    public void add(List<? extends T> fruitsList) {
        fruits.addAll(fruitsList);
    }

    // пересыпать
    public void interlard(Box<? super T> destinationBox) {
        if (destinationBox == this) {
            System.out.println("Коробку нельзя пересыпать саму в себя");
            return;
        }
        Collections.reverse(fruits);
        destinationBox.add(fruits);
        fruits.clear();
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruits=" + fruits+
                '}';
    }
}
