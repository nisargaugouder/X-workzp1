package com.xworkz.assignment.internal.dress;

public class Dress {
    private String type;
    private String size;
    private String color;

    public Dress(String type, String size, String color) {
        this.type = type;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dress{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("DressHashCode:"+super.hashCode());
        return 451;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Dress){
                System.out.println("have ref.will compare..");
                Dress dress1=this;
                Dress dress2=(Dress) obj;
                if(dress1.color.equals(dress2.color) && dress1.type.equals(dress2.type)){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
