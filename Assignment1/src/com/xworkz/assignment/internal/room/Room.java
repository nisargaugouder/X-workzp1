package com.xworkz.assignment.internal.room;

public class Room {
    private String type;
    private double area;
    private boolean hasAC;

    public Room(String type, double area, boolean hasAC) {
        this.type = type;
        this.area = area;
        this.hasAC = hasAC;
    }

    @Override
    public String toString() {
        return "Room{" +
                "type='" + type + '\'' +
                ", area=" + area +
                ", hasAC=" + hasAC +
                '}';
    }
}
