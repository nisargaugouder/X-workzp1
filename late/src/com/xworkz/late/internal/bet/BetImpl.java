package com.xworkz.late.internal.bet;

public class BetImpl implements Bet {
    public BetImpl() {
        System.out.println("no-arg constructor of BetImpl");
    }

    @Override
    public void win() {
        System.out.println("Winning the bet");
    }
}
