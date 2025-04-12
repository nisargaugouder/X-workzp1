package com.xworkz.assignment.internal.continent;

public class Continent {
    private String name;
    private int area;
    private int countries;

    public Continent(String name, int area, int countries) {
        this.name = name;
        this.area = area;
        this.countries = countries;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", countries=" + countries +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("ContinentHashCode:"+super.hashCode());
        return 754;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Continent){
                System.out.println("have ref.will compare..");
                Continent continent1=this;
                Continent continent2=(Continent) obj;
                if(continent2.area==continent1.area){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
