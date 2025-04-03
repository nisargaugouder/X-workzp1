package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.instagram.Instagram;
import com.xworkz.inheritence.internal.instagram.InstagramReels;

public class InstagramRunner {
    public static void main(String[] args) {
        Instagram instagram = new InstagramReels();
        instagram.postPhoto();
        instagram.sendMessage();
        instagram.followUsers();
        instagram.viewStories();
        instagram.likePosts();

        System.out.println("-----------------");
        InstagramReels reels = new InstagramReels();
        reels.postPhoto();
        reels.sendMessage();
        reels.followUsers();
        reels.viewStories();
        reels.likePosts();
    }
}
