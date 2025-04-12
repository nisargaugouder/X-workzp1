package com.xworkz.assignment.internal.temple;

public class Temple {
    private String name;
    private String location;
    private int yearEstablished;

    public Temple(String name, String location, int yearEstablished) {
        this.name = name;
        this.location = location;
        this.yearEstablished = yearEstablished;
    }

    @Override
    public String toString() {
        return "Temple{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", yearEstablished=" + yearEstablished +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println("templeHashCode:"+super.hashCode());
        return 841;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof Temple){
                System.out.println("obj instance of class");
                Temple temple1=this;
                Temple temple2=(Temple) obj;
                if(temple1.location==temple2.location && temple1.name.equals(temple2.name) && temple1.yearEstablished==temple2.yearEstablished){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
