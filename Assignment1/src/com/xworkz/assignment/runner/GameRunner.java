package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.game.Game;

public class GameRunner {
    public static void main(String[] args) {
        Game game = new Game("Chess", "Strategy", 2);
        System.out.println(game);
    }
}
