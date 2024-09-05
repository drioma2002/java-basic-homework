package ru.otus.drioma2002.java.basic.homeworks.homework12;

/*
Реализуйте приложение, позволяющее работать с текстовыми файлами
При старте приложения, в консоль выводится список текстовых файлов из корневого каталоге проекта
Далее программа запрашивает имя файла, с которым хочет работать пользователь
Содержимое файла выводится в консоль
Затем любую введенную пользователем строку необходимо записывать в указанный файл
 */

import java.nio.charset.StandardCharsets;
import java.util.*;
import java.io.*;

public class Homework12 {
    public static void main(String[] args) {
        File folder = new File(".");
        File file;

        if (!folder.isDirectory()) {
            System.out.println("Указана не папка");
            return;
        }

        if (!printFileList(folder)) {
            System.out.println("Отсутствуют текстовые файлы в папке: " + folder );
            return;
        }

        file = choseFile();

        readFile(file);

        writeFile(file);

        readFile(file);
    }

    public static void writeInFile(String string, String fileName) {
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(fileName, true))) {
            byte[] buffer = string.getBytes(StandardCharsets.UTF_8);
            out.write(buffer);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(File file) {
        if (!isFileExists(file)) {
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст для записи в файл: ");

        String someText = scanner.nextLine() + "\n";

        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file, true))) {
            byte[] buffer = someText.getBytes(StandardCharsets.UTF_8);
            out.write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(File file) {
        try (InputStreamReader in = new InputStreamReader(new BufferedInputStream(new FileInputStream(file)))) {
            int n = in.read();
            while (n != -1) {
                System.out.print((char) n);
                n = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static File choseFile () {
        Scanner scanner = new Scanner(System.in);

        File file;
        do {
            System.out.print("Введите имя файла: ");
            file = new File(scanner.next());
        } while (!isFileExists(file));
        return file;
    }

    public static boolean printFileList(File folder) {

        FileFilter txtFilefilter = new FileFilter() {
            public boolean accept(File file) {
                if (file.getName().endsWith(".txt")) {
                    return true;
                }
                return false;
            }
        };

        for (File f : Objects.requireNonNull(folder.listFiles(txtFilefilter))) {
            System.out.println(f.getName());
        }

        return folder.listFiles(txtFilefilter).length > 0;
    }

    public static boolean isFileExists(File file) {
        return file.exists();
    }
}
