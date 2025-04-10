package com.xworkz.assignment.internal.goa;

public class Goa {
    private String beachName;
    private String location;
    private boolean isPopular;

    public Goa(String beachName, String location, boolean isPopular) {
        this.beachName = beachName;
        this.location = location;
        this.isPopular = isPopular;
    }

    @Override
    public String toString() {
        return "Goa{" +
                "beachName='" + beachName + '\'' +
                ", location='" + location + '\'' +
                ", isPopular=" + isPopular +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("GoaHashCode:"+super.hashCode());
        return 765;
    }
}
