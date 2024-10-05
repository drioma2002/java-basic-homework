package ru.otus.drioma2002.java.basic.homeworks.homework20;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Homework20 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Введите имя файла:");
            String fileName = scanner.nextLine();

            System.out.println("Введите текст для поиска:");
            String textToSearch = scanner.nextLine();

            if (textToSearch == null || textToSearch.isEmpty()) {
                System.out.println("Текст для поиска не может быть пустой");
                return;
            }

            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName, StandardCharsets.UTF_8))) {

                int matchCount = countTextMatches(bufferedReader, textToSearch);
                System.out.println("Фраза '" + textToSearch + "' встречается в файле '" + fileName + "' " + matchCount + " раз(а).");

            } catch (FileNotFoundException e) {
                System.out.println("Файл '" + fileName + "' не найден");
            } catch (IOException e) {
                System.out.println("Произошла ошибка при чтении файла: " + e.getMessage());
            }
        }
    }

    public static int countTextMatches(BufferedReader bufferedReader, String textToSearch) throws IOException {
        String fileLine;
        int matchesCount = 0;

        while ((fileLine = bufferedReader.readLine()) != null) {
// мой вариант:
//            if (fileLine.contains(textToSearch)) {
//
//                while (fileLine.contains(textToSearch)) {
//                    int position = fileLine.indexOf(textToSearch);
//                    fileLine = fileLine.substring(position + textToSearch.length());
//                    matchesCount ++;
//                }
//            }

            // исправленный вариант:
            int position = 0;
            while ((position = fileLine.indexOf(textToSearch, position)) != -1) {
                matchesCount++;
                position += textToSearch.length();
            }

        }

        return matchesCount;
    }
}
