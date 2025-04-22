package com.xworkz.late.internal.art;

public class PainterArtistImpl implements Artist {
    public PainterArtistImpl(){
        System.out.println("no arg cos of PainterArtistImpl");
    }
    @Override
    public void paint() {
        System.out.println("Creating art with paint");
    }
}
