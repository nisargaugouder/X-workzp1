package com.xworkz.inheritence.internal.party;

public class BirthdayParty extends Party {
    public BirthdayParty() {
        super();
        System.out.println("BirthdayParty --child");
    }

    @Override
    public void invite() {
        System.out.println("BirthdayParty invites friends and family --child");
    }

    @Override
    public void food() {
        System.out.println("BirthdayParty includes cake and snacks --child");
    }

    @Override
    public void music() {
        System.out.println("BirthdayParty plays fun and joyful music --child");
    }

    @Override
    public void dance() {
        System.out.println("BirthdayParty has dance and entertainment --child");
    }

    @Override
    public void decorate() {
        System.out.println("BirthdayParty is decorated with balloons and lights --child");
    }
}
