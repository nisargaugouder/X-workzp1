package com.xworkz.interfaces.rule;

public interface Friend {
    void support();
    void share();
    void makeLaugh();
    default void inNeed(){
        System.out.println("in need");
    }
}
