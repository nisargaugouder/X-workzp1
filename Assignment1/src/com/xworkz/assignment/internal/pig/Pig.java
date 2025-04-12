package com.xworkz.assignment.internal.pig;

public class Pig {
    private String breed;
    private int age;
    private double weight;

    public Pig(String breed, int age, double weight) {
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "breed='" + breed + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("PigHashCode:"+super.hashCode());
        return 81;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof Pig){
                System.out.println("obj instance of class");
                Pig pig1=this;
                Pig pig2=(Pig) obj;
                if(pig1.age==pig2.age && pig1.weight==pig2.weight && pig1.breed.equals(pig2.breed)){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
