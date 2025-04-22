package com.xworkz.late.external.follow;

import com.xworkz.late.internal.game.Game;

public class PlayGround {
    private Game game;

    public PlayGround(Game game) {
        this.game = game;
    }

    public void enjoy() {
        System.out.println("Running enjoy in PlayGround");
        if (this.game != null) {
            this.game.play();
        } else {
            System.out.println("error");
        }
    }
}
