package com.xworkz.assignment.internal.potato;

public class Potato {
    private String variety;
    private double weight;
    private String origin;

    public Potato(String variety, double weight, String origin) {
        this.variety = variety;
        this.weight = weight;
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Potato{" +
                "variety='" + variety + '\'' +
                ", weight=" + weight +
                ", origin='" + origin + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("PotatoHashCode:"+super.hashCode());
        return 732;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof Potato){
                System.out.println("obj instance of class");
                Potato potato1=this;
                Potato potato2=(Potato) obj;
                if(potato1.origin.equals(potato2.origin) && potato1.variety.equals(potato2.variety) && potato1.weight==potato2.weight){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
