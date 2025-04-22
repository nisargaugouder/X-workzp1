package com.xworkz.late.external.follow;

import com.xworkz.late.internal.friend.Friend;

public class Life {
    private Friend friend;

    public Life(Friend friend) {
        this.friend = friend;
    }

    public void support() {
        System.out.println("Running support in Life");
        if (this.friend != null) {
            this.friend.help();
        } else {
            System.out.println("error");
        }
    }
}
