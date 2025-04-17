package com.xworkz.interfaces.rule;

public interface Kid {
    void play();
    void learn();
    void eat();
    default void child(){
        System.out.println("child");
    }
}
