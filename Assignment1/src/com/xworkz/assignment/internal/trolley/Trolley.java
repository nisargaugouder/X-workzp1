package com.xworkz.assignment.internal.trolley;

public class Trolley {
    private String type;
    private double capacity;
    private boolean isMotorized;

    public Trolley(String type, double capacity, boolean isMotorized) {
        this.type = type;
        this.capacity = capacity;
        this.isMotorized = isMotorized;
    }

    @Override
    public String toString() {
        return "Trolley{" +
                "type='" + type + '\'' +
                ", capacity=" + capacity +
                ", isMotorized=" + isMotorized +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("TrolleyHashCode:"+super.hashCode());
        return 62;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof Trolley){
                System.out.println("obj instance of class");
                Trolley trolley1=this;
                Trolley trolley2=(Trolley) obj;
                if(trolley1.isMotorized==trolley2.isMotorized && trolley1.type.equals(trolley2.type) && trolley1.capacity==trolley2.capacity){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
