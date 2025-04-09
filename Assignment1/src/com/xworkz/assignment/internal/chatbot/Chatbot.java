package com.xworkz.assignment.internal.chatbot;

public class Chatbot {
    private String name;
    private String language;
    private boolean isAI;

    public Chatbot(String name, String language, boolean isAI) {
        this.name = name;
        this.language = language;
        this.isAI = isAI;
    }

    @Override
    public String toString() {
        return "Chatbot{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", isAI=" + isAI +
                '}';
    }
}
