package com.xworkz.inheritence.internal.metal;

public class Gold extends Metal {
    public Gold() {
        super();
        System.out.println("Gold --child");
    }

    @Override
    public void conduct() {
        System.out.println("Gold is an excellent conductor --child");
    }

    @Override
    public void durable() {
        System.out.println("Gold remains untarnished for years --child");
    }

    @Override
    public void malleable() {
        System.out.println("Gold is the most malleable metal --child");
    }

    @Override
    public void dense() {
        System.out.println("Gold is denser than most metals --child");
    }

    @Override
    public void resist() {
        System.out.println("Gold resists rust and corrosion --child");
    }
}
