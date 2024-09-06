package ru.otus.drioma2002.java.basic.homeworks.homework13.client;

import java.io.*;
import java.net.Socket;

public class Client implements AutoCloseable{
    private final DataInputStream inputStream;
    private final DataOutputStream outputStream;

    public Client(Socket socket) throws IOException {
        this.inputStream = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        this.outputStream = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
    }

    public void send(String str) throws IOException {
        outputStream.writeUTF(str);
        outputStream.flush();
    }

    public String read() throws IOException {
        return inputStream.readUTF();
    }

    @Override
    public void close() throws Exception {
        inputStream.close();
        outputStream.close();
    }
}
