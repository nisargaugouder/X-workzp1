package com.xworkz.assignment.internal.river;

public class River {
    private String name;
    private double length;
    private String origin;

    public River(String name, double length, String origin) {
        this.name = name;
        this.length = length;
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "River{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", origin='" + origin + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("RiverHashCode:"+super.hashCode());
        return 632;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof River){
                System.out.println("obj instance of class");
                River river1=this;
                River river2=(River) obj;
                if(river1.length==river2.length && river1.name.equals(river2.name) && river1.origin.equals(river2.origin)){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
