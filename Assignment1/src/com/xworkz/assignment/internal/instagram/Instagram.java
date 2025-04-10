package com.xworkz.assignment.internal.instagram;

public class Instagram {
    private String username;
    private int followers;
    private boolean isPrivate;

    public Instagram(String username, int followers, boolean isPrivate) {
        this.username = username;
        this.followers = followers;
        this.isPrivate = isPrivate;
    }

    @Override
    public String toString() {
        return "Instagram{" +
                "username='" + username + '\'' +
                ", followers=" + followers +
                ", isPrivate=" + isPrivate +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("instagramHashCode:"+super.hashCode());
        return 34;
    }
}
