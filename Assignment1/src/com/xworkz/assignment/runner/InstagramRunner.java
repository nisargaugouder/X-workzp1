package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.instagram.Instagram;

public class InstagramRunner {
    public static void main(String[] args) {
        Instagram instagram = new Instagram("john_doe", 1500, false);
        System.out.println(instagram);
    }
}
