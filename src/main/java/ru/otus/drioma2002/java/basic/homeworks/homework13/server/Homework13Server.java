package ru.otus.drioma2002.java.basic.homeworks.homework13.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Homework13Server {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);

        System.out.println("Server is running");

        while(true) {
            Socket clientAccept = serverSocket.accept();
            System.out.println("Client connected!");

            writeResponse(clientAccept, "Введите запрос в виде: число1 пробел операция пробел число2\n(доступные операции: +,-,*,/):");
            String clientReq = readRequest(clientAccept);

            String clientAnswer = makeOperation(clientReq);
            System.out.println("Ответ " + clientAnswer);
            writeResponse(clientAccept, clientAnswer);
        }
    }

    private static String makeOperation (String req){
        String[] splitReq = req.split(" ");

        if (splitReq.length != 3) {
            return "неверный запрос";
        }

        Double num1 = Double.parseDouble(splitReq[0]);
        String oper = splitReq[1];
        Double num2 = Double.parseDouble(splitReq[2]);

        System.out.println("Запрос: " + num1 + " " + oper + " " + num2);
        double result = 0;

        switch (oper){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                return "Орперация " + oper + " не поддерживается";
        }

        return num1 + " " + oper + " " + num2 + " = " + result;
    }

    private static void writeResponse(Socket socket, String str) throws IOException {
        DataOutputStream output = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
        output.writeUTF(str);
        output.flush();
    }

    private static String readRequest(Socket socket) throws IOException {
        DataInputStream input = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        return input.readUTF();
    }
}
