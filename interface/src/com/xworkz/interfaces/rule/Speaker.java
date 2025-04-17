package com.xworkz.interfaces.rule;

public interface Speaker {
    void produceSound();
    void connectBluetooth();
    void increaseVolume();
    default void sound(){
        System.out.println("sound");
    }
}
