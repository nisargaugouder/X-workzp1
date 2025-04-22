package com.xworkz.late.internal.game;

public class CricketGameImpl implements Game {
    public CricketGameImpl() {
        System.out.println("no-arg const CricketGameImpl");
    }

    @Override
    public void play() {
        System.out.println("Playing CricketGameImpl");
    }
}
