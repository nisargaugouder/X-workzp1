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

    @Override
    public int hashCode() {
        System.out.println("ChurchHashCode:"+super.hashCode());
        return 235;
    }
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Church){
                System.out.println("have ref.will compare..");
                Church church1=this;
                Church church2=(Church) obj;
                if(church1.capacity==church2.capacity){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
