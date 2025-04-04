package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.chatbot.Chatbot;
import com.xworkz.inheritence.internal.chatbot.AIChatbot;

public class ChatbotRunner {
    public static void main(String[] args) {
        Chatbot chatbot = new AIChatbot();
        chatbot.respond();
        chatbot.learnFromData();
        chatbot.assistUsers();
        chatbot.integrateWithApps();
        chatbot.supportMultipleLanguages();

        System.out.println("-----------------");
        AIChatbot aiChatbot = new AIChatbot();
        aiChatbot.respond();
        aiChatbot.learnFromData();
        aiChatbot.assistUsers();
        aiChatbot.integrateWithApps();
        aiChatbot.supportMultipleLanguages();
    }
}
