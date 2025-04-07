package com.xworkz.inheritence.internal.instagram;

public class SocialMedia {
    public void timeWaste(Instagram instagram){
        instagram.follow();
        instagram.likes();
        instagram.message();
        instagram.post();
        instagram.story();

        if(instagram instanceof InstagramReels){
            InstagramReels instagramReels=(InstagramReels) instagram;
            instagramReels.phone();
        }
    }
}
