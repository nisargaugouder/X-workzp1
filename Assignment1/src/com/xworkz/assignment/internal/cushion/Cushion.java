package com.xworkz.assignment.internal.cushion;

import com.xworkz.assignment.internal.bucket.Bucket;

public class Cushion {
    private String shape;
    private String color;
    private int price;

    public Cushion(String shape, String color, int price) {
        this.shape = shape;
        this.color = color;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Cushion{" +
                "shape='" + shape + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("CushionHashCode:"+super.hashCode());
        return 12335;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Bucket){
                System.out.println("have ref.will compare..");
                Cushion cushion1=this;
                Cushion cushion2=(Cushion) obj;
                if(cushion1.price==cushion2.price){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
