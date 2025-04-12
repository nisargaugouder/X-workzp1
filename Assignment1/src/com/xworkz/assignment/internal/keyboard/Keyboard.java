package com.xworkz.assignment.internal.keyboard;

public class Keyboard {
    private String brand;
    private boolean isMechanical;
    private int numberOfKeys;

    public Keyboard(String brand, boolean isMechanical, int numberOfKeys) {
        this.brand = brand;
        this.isMechanical = isMechanical;
        this.numberOfKeys = numberOfKeys;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "brand='" + brand + '\'' +
                ", isMechanical=" + isMechanical +
                ", numberOfKeys=" + numberOfKeys +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println("KeyboardHashCode:"+super.hashCode());
        return 9;
    }
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Keyboard){
                System.out.println("have ref.will compare..");
                Keyboard keyboard1=this;
                Keyboard keyboard2=(Keyboard) obj;
                if(keyboard1.brand.equals(keyboard2.brand) && keyboard2.isMechanical==keyboard1.isMechanical){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
