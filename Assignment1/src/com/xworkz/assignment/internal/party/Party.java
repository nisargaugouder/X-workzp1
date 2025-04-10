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
}
