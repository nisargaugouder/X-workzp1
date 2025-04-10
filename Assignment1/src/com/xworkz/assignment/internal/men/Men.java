package com.xworkz.assignment.internal.men;

public class Men {
    private String name;
    private int age;
    private String occupation;

    public Men(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "Men{name='" + name + "', age=" + age + ", occupation='" + occupation + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("MenHashCode:"+super.hashCode());
        return 200;
    }
}
