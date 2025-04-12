package com.xworkz.assignment.internal.cardboard;

public class Cardboard {
    private String type;
    private double thickness;
    private String color;

    public Cardboard(String type, double thickness, String color) {
        this.type = type;
        this.thickness = thickness;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cardboard{" +
                "type='" + type + '\'' +
                ", thickness=" + thickness +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("CardBoardHashCode:"+super.hashCode());
        return 34;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Cardboard){
                System.out.println("have ref.will compare..");
                Cardboard cardboard1=this;
                Cardboard cardboard2=(Cardboard) obj;
                if(cardboard1.type.equals(cardboard2.type)){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
