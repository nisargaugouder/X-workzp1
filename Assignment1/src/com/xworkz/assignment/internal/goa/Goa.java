package com.xworkz.assignment.internal.goa;

public class Goa {
    private String beachName;
    private String location;
    private boolean isPopular;

    public Goa(String beachName, String location, boolean isPopular) {
        this.beachName = beachName;
        this.location = location;
        this.isPopular = isPopular;
    }

    @Override
    public String toString() {
        return "Goa{" +
                "beachName='" + beachName + '\'' +
                ", location='" + location + '\'' +
                ", isPopular=" + isPopular +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println("GoaHashCode:"+super.hashCode());
        return 765;
    }

    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Goa){
                System.out.println("have ref.will compare..");
                Goa goa1=this;
                Goa goa2=(Goa) obj;
                if(goa1.beachName.equals(goa2.beachName) && goa1.location.equals(goa2.location)){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
