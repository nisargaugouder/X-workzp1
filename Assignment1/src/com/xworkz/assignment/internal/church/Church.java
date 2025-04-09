package com.xworkz.assignment.internal.church;

public class Church {
    private String name;
    private String location;
    private int capacity;

    public Church(String name, String location, int capacity) {
        this.name = name;
        this.location = location;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Church{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
