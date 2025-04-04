package com.xworkz.inheritence.internal.game;

public class Game {
    public Game() {
        System.out.println("Game --parent");
    }

    public void play() {
        System.out.println("Game is played for fun --parent");
    }

    public void strategy() {
        System.out.println("Some games require strategy --parent");
    }

    public void opponent() {
        System.out.println("Games involve opponents --parent");
    }

    public void winner() {
        System.out.println("Games have winners and losers --parent");
    }

    public void duration() {
        System.out.println("Games have different durations --parent");
    }
}
