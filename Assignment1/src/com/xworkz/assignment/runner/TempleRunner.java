package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.temple.Temple;

public class TempleRunner {
    public static void main(String[] args) {
        Temple temple = new Temple("Golden Temple", "Amritsar", 1581);
        System.out.println(temple);
        System.out.println(temple.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(temple));
    }
}
