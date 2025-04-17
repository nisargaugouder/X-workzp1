package com.xworkz.interfaces.rule;

public interface Pluto {
    void revolve();
    void rotate();
    void hasIce();
    default void planet(){
        System.out.println("planet");
    }
}
