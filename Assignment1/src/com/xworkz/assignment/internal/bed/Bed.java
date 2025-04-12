package com.xworkz.assignment.internal.bed;

public class Bed {
    private String size;
    private String material;
    private boolean hasHeadboard;

    public Bed() {
        System.out.println("Running no-arg constructor of Bed");
        this.size = "Queen";
        this.material = "Wood";
        this.hasHeadboard = true;
    }

    @Override
    public String toString() {
        return "Size: " + size + ", Material: " + material + ", Has Headboard: " + hasHeadboard;
    }

    @Override
    public int hashCode() {
        System.out.println("BedHashCode"+super.hashCode());
        return 15;
    }

    public void setSize(String size) {
        this.size = size;
    }


    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Bed){
                System.out.println("have ref.will compare..");
                Bed bed1=this;
                Bed bed2=(Bed) obj;
                if(bed1.size.equals(bed2.size)){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
