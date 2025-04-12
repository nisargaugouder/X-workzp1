package com.xworkz.assignment.internal.kurtha;

public class Kurtha {
    private String fabric;
    private String size;
    private String color;

    public Kurtha(String fabric, String size, String color) {
        this.fabric = fabric;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Kurtha{" +
                "fabric='" + fabric + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("KurthaHashCode:"+super.hashCode());
        return 853;
    }
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Kurtha){
                System.out.println("have ref.will compare..");
                Kurtha kurtha1=this;
                Kurtha kurtha2=(Kurtha) obj;
                if(kurtha1.color.equals(kurtha2.color) && kurtha2.size.equals(kurtha1.size)){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
