package com.xworkz.inheritence.internal.game;

public class Chess extends Game {
    public Chess() {
        super();
        System.out.println("Chess --child");
    }

    @Override
    public void play() {
        System.out.println("Chess is played on a board --child");
    }

    @Override
    public void strategy() {
        System.out.println("Chess requires deep strategy --child");
    }

    @Override
    public void opponent() {
        System.out.println("Chess is played between two opponents --child");
    }

    @Override
    public void winner() {
        System.out.println("Chess ends with checkmate --child");
    }

    @Override
    public void duration() {
        System.out.println("Chess games vary in duration --child");
    }
}
