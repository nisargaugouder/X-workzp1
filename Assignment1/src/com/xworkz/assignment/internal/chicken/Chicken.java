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

    public void setAge(int age) {
        this.age = age;
    }

    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Chicken){
                System.out.println("have ref.will compare..");
                Chicken chicken1=this;
                Chicken chicken2=(Chicken) obj;
                if(chicken1.age==chicken2.age){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
