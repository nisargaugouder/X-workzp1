package com.xworkz.late.external.follow;

import com.xworkz.late.internal.art.Artist;

public class Art {
    private Artist artist;

    public Art(Artist artist) {
        this.artist = artist;
    }

    public void express() {
        System.out.println("Art is being expressed");
        if(this.artist!=null){
            this.artist.paint();
        }
        else {
            System.out.println("err");
        }
    }
}
