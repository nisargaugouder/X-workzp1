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

    public void setDirector(String director) {
        this.director = director;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }


    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Ghibli){
                System.out.println("have ref.will compare..");
                Ghibli ghibli1=this;
                Ghibli ghibli2=(Ghibli) obj;
                if(ghibli1.director.equals(ghibli2.director) && ghibli1.releaseYear==ghibli2.releaseYear){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
