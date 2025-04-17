package com.xworkz.interfaces.rule;

public interface Network {
    void connect();
    void transferData();
    void disconnect();
    default void speed(){
        System.out.println("speed");
    }
}
