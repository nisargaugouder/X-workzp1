package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.netflix.Netflix;

public class NetflixRunner {
    public static void main(String[] args) {
        Netflix netflix = new Netflix("Premium", 649, 4);
        System.out.println(netflix);
    }
}
