package com.xworkz.inheritence.internal.ghibli;

public class ChatGPT {
    public void platform(Ghibli ghibli){
        ghibli.animate();
        ghibli.fantasy();
        ghibli.inspire();
        ghibli.nature();
        ghibli.story();

        if(ghibli instanceof GhibliMovie){
            System.out.println("ghibli instanceof GhibliMovie");
            GhibliMovie ghibliMovie=(GhibliMovie) ghibli;
            ghibliMovie.anime();
        }
    }
}
