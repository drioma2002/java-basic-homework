package ru.otus.drioma2002.java.basic.homeworks.homework4;
/*
Попробуйте реализовать класс по его описания:
+объект класса Коробка должны иметь размеры и цвет.
Коробку можно открывать и закрывать.
Коробку можно перекрашивать.
+Изменить размер коробки после создания нельзя.
+У коробки должен быть метод, печатающий информацию о ней в консоль.
В коробку можно складывать предмет (если в ней нет предмета), или выкидывать его оттуда (только если предмет в ней есть),
только при условии что коробка открыта (предметом читаем просто строку).

Выполнение методов должно сопровождаться выводом сообщений в консоль.
 */
public class BoxManipulator {
    public static void main(String[] args) {
        Box box = new Box("черный", 2,2,2);

        box.printInfo();
        box.setColor("белый");
        box.printInfo();
        box.putItem("карандаш");
        box.open();
        box.printInfo();
        box.putItem("карандаш");
        box.printInfo();
        box.putItem("линейка");
        box.printInfo();
        box.close();
        box.eject();
        box.open();
        box.eject();
        box.putItem("линейка");
        box.close();
        box.printInfo();
    }
}
