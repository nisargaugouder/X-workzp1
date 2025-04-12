package com.xworkz.assignment.internal.city;

public class City {
    private String name;
    private String state;
    private int population;

    public City(String name, String state, int population) {
        this.name = name;
        this.state = state;
        this.population = population;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", population=" + population +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("CityHashCode:"+super.hashCode());
        return 3456;
    }
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof City){
                System.out.println("have ref.will compare..");
                City city1=this;
                City city2=(City) obj;
                if(city1.name.equals(city2.name)){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
