package com.xworkz.inheritence.internal.chatbot;

public class AIChatbot extends Chatbot {

    @Override
    public void reply() {
        System.out.println("AIChatbot is replying smartly");
    }

    @Override
    public void learn() {
        System.out.println("AIChatbot is learning with AI models");
    }

    @Override
    public void help() {
        System.out.println("AIChatbot is helping with AI features");
    }

    @Override
    public void integrate() {
        System.out.println("AIChatbot is integrating with AI tools");
    }

    @Override
    public void support() {
        System.out.println("AIChatbot is providing advanced support");
    }

    public void autoReply() {
        System.out.println("AIChatbot is doing auto-reply using ML algorithms");
    }
}
