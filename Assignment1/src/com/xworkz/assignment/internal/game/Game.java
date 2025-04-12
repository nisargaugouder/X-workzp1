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

    @Override
    public int hashCode() {
        System.out.println("GameHashCode:"+super.hashCode());
        return 29;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Game){
                System.out.println("have ref.will compare..");
                Game game1=this;
                Game game2=(Game) obj;
                if(game1.genre.equals(game2.genre) && game1.maxPlayers==game2.maxPlayers){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
