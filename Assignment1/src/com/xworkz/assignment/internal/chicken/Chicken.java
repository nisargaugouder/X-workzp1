package com.xworkz.assignment.internal.chicken;

public class Chicken {
    private String breed;
    private int age;
    private boolean isBroiler;

    public Chicken(String breed, int age, boolean isBroiler) {
        this.breed = breed;
        this.age = age;
        this.isBroiler = isBroiler;
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "breed='" + breed + '\'' +
                ", age=" + age +
                ", isBroiler=" + isBroiler +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("ChickenHashCode:"+super.hashCode());
        return 234;
    }
}
