package com.xworkz.assignment.internal.drink;

public class Drink {
    private String name;
    private int volume;
    private boolean isAlcoholic;

    public Drink(String name, int volume, boolean isAlcoholic) {
        this.name = name;
        this.volume = volume;
        this.isAlcoholic = isAlcoholic;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", isAlcoholic=" + isAlcoholic +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int hashCode() {
        System.out.println("DrinkHashCode:"+super.hashCode());
        return 5451;
    }
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Drink){
                System.out.println("have ref.will compare..");
                Drink drink1=this;
                Drink drink2=(Drink) obj;
                if(drink1.name.equals(drink2.name) && drink1.volume==drink2.volume){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
