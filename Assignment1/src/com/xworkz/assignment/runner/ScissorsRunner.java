package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.scissors.Scissors;

public class ScissorsRunner {
    public static void main(String[] args) {
        Scissors scissors = new Scissors("Fiskars", "Craft", 8.5);
        System.out.println(scissors);
        System.out.println(scissors.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(scissors));
    }
}
