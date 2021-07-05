package ru.geekbrains.chat.client.chat_server;

import ru.geekbrains.chat.client.chat_server.server.ChatServer;

public class ServerApp {
    public static void main(String[] args) {
        new ChatServer().start();
    }
}
