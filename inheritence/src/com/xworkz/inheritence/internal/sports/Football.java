package com.xworkz.inheritence.internal.sports;

public class Football extends Sports {
    public Football() {
        super();
        System.out.println("Football --child");
    }

    @Override
    public void play() {
        System.out.println("Football is played with a ball --child");
    }

    @Override
    public void rules() {
        System.out.println("Football has 11 players per team --child");
    }

    @Override
    public void competition() {
        System.out.println("Football has leagues and tournaments --child");
    }

    @Override
    public void team() {
        System.out.println("Football is a team sport --child");
    }

    @Override
    public void training() {
        System.out.println("Football requires fitness training --child");
    }
}
