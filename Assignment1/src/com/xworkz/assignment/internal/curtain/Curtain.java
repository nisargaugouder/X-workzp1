package com.xworkz.assignment.internal.curtain;

public class Curtain {
    private String color;
    private String material;
    private int length;

    public Curtain(String color, String material, int length) {
        this.color = color;
        this.material = material;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Curtain{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", length=" + length +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("CurtainHashCode:"+super.hashCode());
        return 546;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Curtain){
                System.out.println("have ref.will compare..");
                Curtain curtain1=this;
                Curtain curtain2=(Curtain) obj;
                if(curtain2.material.equals(curtain1.material)){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
