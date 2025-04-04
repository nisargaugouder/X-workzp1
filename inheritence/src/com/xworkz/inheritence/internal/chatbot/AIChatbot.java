package com.xworkz.inheritence.internal.chatbot;

public class AIChatbot extends Chatbot {
    public AIChatbot() {
        super();
        System.out.println("Running non-arg constructor AIChatbot--child");
    }

    @Override
    public void reply() {
        System.out.println("AIChatbot gives replies--child");
    }

    @Override
    public void learn() {
        System.out.println("AIChatbot learns from data--child");
    }

    @Override
    public void help() {
        System.out.println("AIChatbot helps users--child");
    }

    @Override
    public void integrate() {
        System.out.println("AIChatbot integrates with apps--child");
    }

    @Override
    public void support() {
        System.out.println("AIChatbot supports multiple languages--child");
    }
}
