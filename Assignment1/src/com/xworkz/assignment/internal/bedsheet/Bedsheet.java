package com.xworkz.assignment.internal.bedsheet;

public class Bedsheet {
    private String material;
    private String color;
    private String size;

    public Bedsheet() {
        System.out.println("Running no-arg constructor of Bedsheet");
        this.material = "Cotton";
        this.color = "White";
        this.size = "King";
    }

    @Override
    public String toString() {
        return "Material: " + material + ", Color: " + color + ", Size: " + size;
    }

    @Override
    public int hashCode() {
        System.out.println("BedsheetHashCode"+super.hashCode());
        return 122;
    }



    public void setColor(String color) {
        this.color = color;
    }

    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Bedsheet){
                System.out.println("have ref.will compare..");
                Bedsheet bedsheet1=this;
                Bedsheet bedsheet2=(Bedsheet) obj;
                if(bedsheet1.color.equals(bedsheet2)){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
