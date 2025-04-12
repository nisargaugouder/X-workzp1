package com.xworkz.assignment.internal.party;

public class Party {
    private String occasion;
    private String location;
    private int numberOfGuests;

    public Party(String occasion, String location, int numberOfGuests) {
        this.occasion = occasion;
        this.location = location;
        this.numberOfGuests = numberOfGuests;
    }

    @Override
    public String toString() {
        return "Party{" +
                "occasion='" + occasion + '\'' +
                ", location='" + location + '\'' +
                ", numberOfGuests=" + numberOfGuests +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("PartyHashCode:"+super.hashCode());
        return 81;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof Party){
                System.out.println("obj instance of class");
                Party party1=this;
                Party party2=(Party) obj;
                if(party1.location.equals(party2.location) && party1.numberOfGuests==party2.numberOfGuests && party1.occasion.equals(party2.occasion)){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
