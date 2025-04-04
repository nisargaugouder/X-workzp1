package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.game.Game;
import com.xworkz.inheritence.internal.game.Chess;

public class GameRunner {
    public static void main(String[] args) {
        Game game = new Game();
        game.play();
        game.strategy();
        game.opponent();
        game.winner();
        game.duration();

        System.out.println("-----------");

        Game game2 = new Chess();
        game2.play();
        game2.strategy();
        game2.opponent();
        game2.winner();
        game2.duration();

        System.out.println("-----------");

        Chess chess = new Chess();
        chess.play();
        chess.strategy();
        chess.opponent();
        chess.winner();
        chess.duration();
    }
}
