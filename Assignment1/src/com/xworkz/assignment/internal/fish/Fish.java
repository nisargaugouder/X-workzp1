package com.xworkz.assignment.internal.fish;

public class Fish {
    private String name;
    private String color;
    private double weight;

    public Fish(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fish{name=" + name + ", color=" + color + ", weight=" + weight + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("FishHashCode:"+super.hashCode());
        return 841;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Fish){
                System.out.println("have ref.will compare..");
                Fish fish1=this;
                Fish fish2=(Fish) obj;
                if(fish1.color.equals(fish2.color) && fish1.name.equals(fish2.name)){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
