package com.xworkz.late.external.follow;

import com.xworkz.late.internal.bet.Bet;

public class Casino {
    private Bet bet;

    public Casino(Bet bet) {
        this.bet = bet;
    }

    public void gamble() {
        System.out.println("Running gamble in Casino");
        if (this.bet != null) {
            this.bet.win();
        } else {
            System.out.println("Error: bet is null");
        }
    }
}
