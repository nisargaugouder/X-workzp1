package com.xworkz.assignment.internal.band;

public class Band {
    private String name;
    private String genre;
    private int members;

    public Band() {
        System.out.println("Running no-arg constructor of Band");
        this.name = "The Beatles";
        this.genre = "Rock";
        this.members = 4;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Genre: " + genre + ", Members: " + members;
    }

    @Override
    public int hashCode() {
        System.out.println("BandHashCode"+super.hashCode());
        return 746;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Band){
                System.out.println("have ref.will compare..");
                Band band1=this;
                Band band2=(Band) obj;
                if(band1.name.equals(band2)){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
