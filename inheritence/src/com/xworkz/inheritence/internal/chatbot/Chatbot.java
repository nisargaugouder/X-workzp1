package com.xworkz.inheritence.internal.chatbot;

public class Chatbot {
    public Chatbot() {
        System.out.println("Running non-arg constructor Chatbot--parent");
    }

    public void reply() {
        System.out.println("Chatbot gives replies--parent");
    }

    public void learn() {
        System.out.println("Chatbot learns from data--parent");
    }

    public void help() {
        System.out.println("Chatbot helps users--parent");
    }

    public void integrate() {
        System.out.println("Chatbot integrates with apps--parent");
    }

    public void support() {
        System.out.println("Chatbot supports multiple languages--parent");
    }
}
