package ru.otus.drioma2002.java.basic.homeworks.homework13.client;

import java.net.Socket;
import java.util.Scanner;

public class Homework13Client {
    public static void main (String[] args) {

            try(Socket socket = new Socket("localhost", 8888);
                Client client = new Client(socket)
            ) {
                System.out.println(client.read());

                Scanner scanner = new Scanner(System.in);
                String userInput = scanner.nextLine();

                client.send(userInput);

                System.out.println(client.read());

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
    }
}
