package com.xworkz.assignment.internal.mountain;

public class Mountain {
    private String name;
    private int height;
    private String location;

    public Mountain(String name, int height, String location) {
        this.name = name;
        this.height = height;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Mountain{name='" + name + "', height=" + height + ", location='" + location + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("MountainHashCode:"+super.hashCode());
        return 72;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof Mountain){
                System.out.println("obj instance of class");
                Mountain mountain1=this;
                Mountain mountain2=(Mountain) obj;
                if(mountain1.height==mountain2.height && mountain1.name.equals(mountain2.name) && mountain1.location.equals(mountain2.location)){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
