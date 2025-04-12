package com.xworkz.assignment.internal.bird;

public class Bird {
    private String species;
    private String color;
    private double wingspan;

    public Bird() {
        System.out.println("Running no-arg constructor of Bird");
        this.species = "Parrot";
        this.color = "Green";
        this.wingspan = 0.25;
    }

    @Override
    public String toString() {
        return "Species: " + species + ", Color: " + color + ", Wingspan: " + wingspan + " meters";
    }

    @Override
    public int hashCode() {
        System.out.println("BirdHashCode"+super.hashCode());
        return 23;

    }

    public void setColor(String color) {
        this.color = color;
    }


    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Bird){
                System.out.println("have ref.will compare..");
                Bird bird1=this;
                Bird bird2=(Bird) obj;
                if(bird1.color.equals(bird2.color)){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
