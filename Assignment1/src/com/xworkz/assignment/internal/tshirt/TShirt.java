package com.xworkz.assignment.internal.tshirt;

import java.util.Objects;

public class TShirt {
    private String brand;
    private String size;
    private String color;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "TShirt{" +
                "brand='" + brand + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
           if(obj instanceof TShirt){
               System.out.println("ref is tshirt, will compare.. ");
               TShirt tShirt1=this;
               TShirt tShirt2=(TShirt) obj;
               if(tShirt1.brand==tShirt2.brand && tShirt1.size==tShirt2.size && tShirt1.color.equals(tShirt2.color)){
                   System.out.println("tshirt1 is equal to tshirt2");
                   return true;
               }
           }
        }
        return false;
    }
}


