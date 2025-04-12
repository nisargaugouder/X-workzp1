package com.xworkz.assignment.internal.vegetable;

public class Vegetable {
    private String name;
    private String color;
    private double weight;

    public Vegetable(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println("VegieHashCode:"+super.hashCode());
        return 4122;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof Vegetable){
                System.out.println("obj instance of class");
                Vegetable vegetable1=this;
                Vegetable vegetable2=(Vegetable) obj;
                if(vegetable1.color.equals(vegetable2.color) && vegetable1.name.equals(vegetable2.name) && vegetable1.weight==vegetable2.weight){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
