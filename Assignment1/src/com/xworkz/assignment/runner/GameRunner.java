package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.game.Game;

public class GameRunner {
    public static void main(String[] args) {
        Game game = new Game("Chess", "Strategy", 2);
        System.out.println(game);
        System.out.println(game.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(game));
    }
}
