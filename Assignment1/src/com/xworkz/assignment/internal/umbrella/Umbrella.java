package com.xworkz.assignment.internal.umbrella;

public class Umbrella {
    private String color;
    private String size;
    private boolean isAutomatic;

    public Umbrella(String color, String size, boolean isAutomatic) {
        this.color = color;
        this.size = size;
        this.isAutomatic = isAutomatic;
    }

    @Override
    public String toString() {
        return "Umbrella{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", isAutomatic=" + isAutomatic +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("UmbrellaHashCode:"+super.hashCode());
        return 41;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Umbrella){
                System.out.println("ref is umbrella, will compare");
                Umbrella umbrella1=this;
                Umbrella umbrella2=(Umbrella) umbrella1;
                if(umbrella1.color.equals(umbrella2.color) && umbrella1.size.equals(umbrella2.size) && umbrella1.isAutomatic==umbrella2.isAutomatic){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
