package com.xworkz.assignment.internal.flower;

public class Flower {
    private String name;
    private String color;
    private int petals;

    public Flower(String name, String color, int petals) {
        this.name = name;
        this.color = color;
        this.petals = petals;
    }

    @Override
    public String toString() {
        return "Flower{name=" + name + ", color=" + color + ", petals=" + petals + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("FlowerHashCode:"+super.hashCode());
        return 841;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPetals(int petals) {
        this.petals = petals;
    }

    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Flower){
                System.out.println("have ref.will compare..");
                Flower flower1=this;
                Flower flower2=(Flower) obj;
                if(flower1.name.equals(flower2.name) && flower2.petals==flower1.petals){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
