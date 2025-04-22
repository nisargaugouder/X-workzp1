package com.xworkz.late.internal.friend;

public class BestFriendImpl implements Friend {
    public BestFriendImpl() {
        System.out.println("no-arg const BestFriendImpl");
    }

    @Override
    public void help() {
        System.out.println("BestFriendImpl is helping");
    }
}
