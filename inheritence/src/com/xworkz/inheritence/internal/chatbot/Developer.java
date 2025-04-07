package com.xworkz.inheritence.internal.chatbot;

public class Developer {

    public void checkPerformance(Chatbot chatbot) {
        chatbot.reply();
        chatbot.learn();
        chatbot.help();
        chatbot.integrate();
        chatbot.support();

        if (chatbot instanceof AIChatbot) {
            System.out.println("chatbot instanceof AIChatbot");
            AIChatbot aiChatbot = (AIChatbot) chatbot;
            aiChatbot.autoReply();
        }
    }
}
