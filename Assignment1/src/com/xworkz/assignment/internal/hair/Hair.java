package com.xworkz.assignment.internal.hair;

public class Hair {
    private String color;
    private String type;
    private double length;

    public Hair(String color, String type, double length) {
        this.color = color;
        this.type = type;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Hair{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", length=" + length +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("HairHashCode:"+super.hashCode());
        return 56;
    }
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Hair){
                System.out.println("have ref.will compare..");
                Hair hair1=this;
                Hair hair2=(Hair) obj;
                if(hair1.color.equals(hair2.color) && hair1.type.equals(hair2.type)){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
