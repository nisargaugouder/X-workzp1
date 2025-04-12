package com.xworkz.assignment.internal.bucket;

public class Bucket {
    private int capacity;
    private String material;
    private String color;

    public Bucket(int capacity, String material, String color) {
        this.capacity = capacity;
        this.material = material;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "capacity=" + capacity +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("BuketHashCode:"+super.hashCode());
        return 39;

    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Bucket){
                System.out.println("have ref.will compare..");
                Bucket bucket1=this;
                Bucket bucket2=(Bucket) obj;
                if(bucket1.capacity==bucket2.capacity){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
