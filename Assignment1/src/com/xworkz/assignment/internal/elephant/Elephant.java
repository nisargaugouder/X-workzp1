package com.xworkz.assignment.internal.elephant;

public class Elephant {
    private int age;
    private double weight;
    private String species;

    public Elephant(int age, double weight, String species) {
        this.age = age;
        this.weight = weight;
        this.species = species;
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "age=" + age +
                ", weight=" + weight +
                ", species='" + species + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("ElephantHashCode:"+super.hashCode());
        return 643;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Elephant){
                System.out.println("have ref.will compare..");
                Elephant elephant1=this;
                Elephant elephant2=(Elephant) obj;
                if(elephant1.age==elephant2.age && elephant1.species.equals(elephant2.species)){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
