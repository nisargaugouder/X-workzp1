package com.xworkz.inheritence.internal.lipstick;

public class MatteLipstick extends Lipstick {
    public MatteLipstick() {
        super();
        System.out.println("MatteLipstick --child");
    }

    @Override
    public void color() {
        System.out.println("MatteLipstick gives a bold color --child");
    }

    @Override
    public void shades() {
        System.out.println("MatteLipstick has unique shades --child");
    }

    @Override
    public void texture() {
        System.out.println("MatteLipstick has a dry texture --child");
    }

    @Override
    public void beauty() {
        System.out.println("MatteLipstick enhances lips elegantly --child");
    }

    @Override
    public void makeup() {
        System.out.println("MatteLipstick is a must-have for makeup --child");
    }
}
