package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.heart.Heart;

public class HeartRunner {
    public static void main(String[] args) {
        Heart heart = new Heart(72, "Normal", true);
        System.out.println(heart);
        System.out.println(heart.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(heart));

        Heart heart1 = new Heart(80, "Normal", true);
        Heart heart2 = new Heart(72, "Normal", true);
        boolean same = heart1.equals(heart2);
        System.out.println("same:" + same);
    }
}
