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
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Men){
                System.out.println("have ref.will compare..");
                Men men1=this;
                Men men2=(Men) obj;
                if(men1.name.equals(men2.name) && men1.age==men2.age){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
