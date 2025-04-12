package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.instagram.Instagram;

public class InstagramRunner {
    public static void main(String[] args) {
        Instagram instagram = new Instagram("john_doe", 1500, false);
        System.out.println(instagram);
        System.out.println(instagram.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(instagram));

        Instagram instagram1 = new Instagram("jane_doe", 2000, true);
        Instagram instagram2 = new Instagram("john_doe", 1500, false);
        boolean same = instagram1.equals(instagram2);
        System.out.println("same:" + same);
    }
}
