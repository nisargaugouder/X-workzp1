package com.xworkz.assignment.internal.photo;

public class Photo {
    private String title;
    private String location;
    private String dateTaken;

    public Photo(String title, String location, String dateTaken) {
        this.title = title;
        this.location = location;
        this.dateTaken = dateTaken;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "title='" + title + '\'' +
                ", location='" + location + '\'' +
                ", dateTaken='" + dateTaken + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("PhotoHashCode:"+super.hashCode());
        return 45;
    }
}
