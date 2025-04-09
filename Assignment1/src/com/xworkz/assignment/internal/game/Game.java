package com.xworkz.assignment.internal.game;

public class Game {
    private String title;
    private String genre;
    private int maxPlayers;

    public Game(String title, String genre, int maxPlayers) {
        this.title = title;
        this.genre = genre;
        this.maxPlayers = maxPlayers;
    }

    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", maxPlayers=" + maxPlayers +
                '}';
    }
}
