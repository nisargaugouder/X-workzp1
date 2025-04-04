package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.party.Party;
import com.xworkz.inheritence.internal.party.BirthdayParty;

public class PartyRunner {
    public static void main(String[] args) {
        Party party = new Party();
        party.invite();
        party.food();
        party.music();
        party.dance();
        party.decorate();

        System.out.println("-----------");

        Party party2 = new BirthdayParty();
        party2.invite();
        party2.food();
        party2.music();
        party2.dance();
        party2.decorate();

        System.out.println("-----------");

        BirthdayParty birthdayParty = new BirthdayParty();
        birthdayParty.invite();
        birthdayParty.food();
        birthdayParty.music();
        birthdayParty.dance();
        birthdayParty.decorate();
    }
}
