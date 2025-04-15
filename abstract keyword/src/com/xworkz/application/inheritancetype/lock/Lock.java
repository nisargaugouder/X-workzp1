package com.xworkz.application.inheritancetype.lock;

public class Lock extends Security {
    Mechanism mechanism = new Mechanism();

    public void secure() {
        mechanism.engage();
    }
}
