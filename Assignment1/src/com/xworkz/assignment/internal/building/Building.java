package com.xworkz.assignment.internal.building;

public class Building {
    private String name;
    private int floors;
    private String location;

    public Building(String name, int floors, String location) {
        this.name = name;
        this.floors = floors;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Building{" +
                "name='" + name + '\'' +
                ", floors=" + floors +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("BuildHashCode:"+super.hashCode());
        return 238;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }


    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Building){
                System.out.println("have ref.will compare..");
                Building building1=this;
                Building building2=(Building) obj;
                if(building1.floors==building2.floors){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
