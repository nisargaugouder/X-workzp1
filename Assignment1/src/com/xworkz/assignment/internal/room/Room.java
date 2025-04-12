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

    @Override
    public int hashCode() {
        System.out.println("RoomHashCode:"+super.hashCode());
        return 5313;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof Room){
                System.out.println("obj instance of class");
                Room room1=this;
                Room room2=(Room) obj;
                if(room1.hasAC==room2.hasAC && room1.type.equals(room2.type) && room1.area==room2.area){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
