package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.ghibli.Ghibli;
import com.xworkz.inheritence.internal.ghibli.GhibliMovie;

public class GhibliRunner {
    public static void main(String[] args) {
        Ghibli ghibli = new GhibliMovie();
        ghibli.createAnimation();
        ghibli.tellStories();
        ghibli.inspireViewers();
        ghibli.featureFantasy();
        ghibli.promoteNature();

        System.out.println("-----------------");
        GhibliMovie ghibliMovie = new GhibliMovie();
        ghibliMovie.createAnimation();
        ghibliMovie.tellStories();
        ghibliMovie.inspireViewers();
        ghibliMovie.featureFantasy();
        ghibliMovie.promoteNature();
    }
}
