package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.party.Party;
import com.xworkz.inheritence.internal.party.BirthdayParty;

public class PartyRunner {
    public static void main(String[] args) {
        Party party = new BirthdayParty();
        party.invitePeople();
        party.haveFood();
        party.playMusic();
        party.dance();
        party.decorateVenue();

        System.out.println("-----------------");
        BirthdayParty birthdayParty = new BirthdayParty();
        birthdayParty.invitePeople();
        birthdayParty.haveFood();
        birthdayParty.playMusic();
        birthdayParty.dance();
        birthdayParty.decorateVenue();
    }
}
