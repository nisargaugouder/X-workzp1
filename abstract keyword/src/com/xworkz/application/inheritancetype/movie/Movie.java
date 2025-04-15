package com.xworkz.application.inheritancetype.movie;

public class Movie extends Entertainment {
    Director director = new Director();

    public void present() {
        director.create();
    }
}
