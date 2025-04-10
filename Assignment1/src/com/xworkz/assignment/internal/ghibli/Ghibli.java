package com.xworkz.assignment.internal.ghibli;

public class Ghibli {
    private String movieTitle;
    private String director;
    private int releaseYear;

    public Ghibli(String movieTitle, String director, int releaseYear) {
        this.movieTitle = movieTitle;
        this.director = director;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Ghibli{" +
                "movieTitle='" + movieTitle + '\'' +
                ", director='" + director + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("GhibliHashCode:"+super.hashCode());
        return 3255;
    }
}
