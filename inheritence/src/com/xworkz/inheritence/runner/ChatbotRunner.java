package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.chatbot.Chatbot;
import com.xworkz.inheritence.internal.chatbot.AIChatbot;

public class ChatbotRunner {
    public static void main(String[] args) {
        Chatbot chatbot1 = new Chatbot();
        chatbot1.reply();
        chatbot1.learn();
        chatbot1.help();
        chatbot1.integrate();
        chatbot1.support();

        System.out.println("-------------------");
        Chatbot chatbot = new AIChatbot();
        chatbot.reply();
        chatbot.learn();
        chatbot.help();
        chatbot.integrate();
        chatbot.support();

        System.out.println("-----------------");
        AIChatbot aiChatbot = new AIChatbot();
        aiChatbot.reply();
        aiChatbot.learn();
        aiChatbot.help();
        aiChatbot.integrate();
        aiChatbot.support();
    }
}
