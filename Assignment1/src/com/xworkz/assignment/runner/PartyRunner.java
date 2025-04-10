package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.party.Party;

public class PartyRunner {
    public static void main(String[] args) {
        Party party = new Party("Birthday", "Bangalore", 50);
        System.out.println(party);
        System.out.println(party.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(party));
    }
}
