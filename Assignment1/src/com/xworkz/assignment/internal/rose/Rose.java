package com.xworkz.assignment.internal.rose;

public class Rose {
    private String color;
    private int numberOfPetals;
    private boolean hasThorns;

    public Rose(String color, int numberOfPetals, boolean hasThorns) {
        this.color = color;
        this.numberOfPetals = numberOfPetals;
        this.hasThorns = hasThorns;
    }

    @Override
    public String toString() {
        return "Rose{" +
                "color='" + color + '\'' +
                ", numberOfPetals=" + numberOfPetals +
                ", hasThorns=" + hasThorns +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("RoseHashCode:"+super.hashCode());
        return 986;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof Rose){
                System.out.println("obj instance of class");
                Rose rose1=this;
                Rose rose2=(Rose) obj;
                if(rose1.hasThorns==rose2.hasThorns && rose1.color.equals(rose2.color) && rose1.numberOfPetals==rose2.numberOfPetals){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
