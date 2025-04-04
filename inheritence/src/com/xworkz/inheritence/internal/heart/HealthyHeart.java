package com.xworkz.inheritence.internal.heart;

public class HealthyHeart extends Heart {
    public HealthyHeart() {
        super();
        System.out.println("HealthyHeart --child");
    }

    @Override
    public void pump() {
        System.out.println("Healthy heart pumps efficiently --child");
    }

    @Override
    public void beat() {
        System.out.println("Healthy heart beats at a steady rate --child");
    }

    @Override
    public void oxygen() {
        System.out.println("Healthy heart provides rich oxygen supply --child");
    }

    @Override
    public void waste() {
        System.out.println("Healthy heart removes waste effectively --child");
    }

    @Override
    public void circulate() {
        System.out.println("Healthy heart ensures smooth circulation --child");
    }
}
