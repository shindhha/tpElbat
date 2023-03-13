package com.example.tpelbat;

import java.util.ArrayList;
import java.util.List;

public class chatRoom {
    private static chatRoom instance;
    private List<String> users;
    private List<String> messages;
    private chatRoom() {
        users = new ArrayList<>();
        messages = new ArrayList<>();
    }

    public void connecter(String pseudo) {
        if (users.contains(pseudo)) throw new IllegalArgumentException();
        users.add(pseudo);
    }

    public void deconnecter(String pseudo) {
        if (!users.contains(pseudo)) throw new IllegalArgumentException();
        users.remove(pseudo);
    }

    public List<String> getMessages() {
        return messages;
    }

    public void postMessage(String pseudo,String message) {
        messages.add(pseudo + " >> " + message);
    }
    public static chatRoom getInstance() {
        if (instance == null) instance = new chatRoom();
        return instance;
    }
}
