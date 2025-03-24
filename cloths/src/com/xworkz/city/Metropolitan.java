package com.xworkz.city;

public class Metropolitan {
    public int total;
    private String name="Bangalore";
    boolean clean=true;

    public void pooja(){
        total=6;
        System.out.println("Total city:"+this.total);
        System.out.println("City name:"+this.name);
        System.out.println("Cleanliness maintained: "+this.clean);
    }
    private void Road(){
        System.out.println("Running Road in Metropolitan");
    }
    void size(){
        System.out.println("Running size in Metropolitan");
    }
}
