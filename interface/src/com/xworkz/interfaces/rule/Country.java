package com.xworkz.interfaces.rule;

public interface Country {
    void develop();
    void maintainLaw();
    void representCulture();
    default void india(){
        System.out.println("india");
    }
}
