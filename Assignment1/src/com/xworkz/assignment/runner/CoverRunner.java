package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.cover.Cover;

public class CoverRunner {
    public static void main(String[] args) {
        Cover cover = new Cover("Mobile Cover", "Plastic", 150);
        System.out.println(cover);
        System.out.println(cover.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(cover));

        Cover cover1 = new Cover("Mobile Cover", "Plastic", 150);
        Cover cover2 = new Cover("Mobile Cover", "Plastic", 150);

        boolean same = cover1.equals(cover2);
        System.out.println("same:" + same);
    }
}
