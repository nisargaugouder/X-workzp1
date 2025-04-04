package com.xworkz.inheritence.internal.instagram;

public class InstagramReels extends Instagram {
    public InstagramReels() {
        super();
        System.out.println("InstagramReels --child");
    }

    @Override
    public void post() {
        System.out.println("Posting a reel --child");
    }

    @Override
    public void message() {
        System.out.println("Sending a quick reply --child");
    }

    @Override
    public void follow() {
        System.out.println("Following creators --child");
    }

    @Override
    public void story() {
        System.out.println("Watching short stories --child");
    }

    @Override
    public void likes() {
        System.out.println("Liking a reel --child");
    }
}
