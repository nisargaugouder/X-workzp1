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
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Instagram){
                System.out.println("have ref.will compare..");
                Instagram instagram1=this;
                Instagram instagram2=(Instagram) obj;
                if(instagram1.followers==instagram2.followers && instagram1.isPrivate==instagram2.isPrivate){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
