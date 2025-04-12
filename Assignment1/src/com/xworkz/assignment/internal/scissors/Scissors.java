package com.xworkz.assignment.internal.scissors;

public class Scissors {
    private String brand;
    private String type;
    private double length;

    public Scissors(String brand, String type, double length) {
        this.brand = brand;
        this.type = type;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Scissors{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", length=" + length +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("ScissorsHashCode:"+super.hashCode());
        return 425;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof Scissors){
                System.out.println("obj instance of class");
                Scissors scissors1=this;
                Scissors scissors2=(Scissors) obj;
                if(scissors1.brand.equals(scissors2.brand) && scissors1.type.equals(scissors2.type) && scissors1.length==scissors2.length){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
