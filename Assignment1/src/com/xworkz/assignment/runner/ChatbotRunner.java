package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.chatbot.Chatbot;

public class ChatbotRunner {
    public static void main(String[] args) {
        Chatbot chatbot = new Chatbot("Alexa", "English", true);
        System.out.println(chatbot);
        System.out.println(chatbot.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(chatbot));
    }
}
