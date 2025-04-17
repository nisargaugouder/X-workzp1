package com.xworkz.interfaces.rule;

public interface People {
    void talk();
    void walk();
    void help();
    default void dull(){
        System.out.println("dull");
    }
}
