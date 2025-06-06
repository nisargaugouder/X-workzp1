package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.clothing.Clothing;

public class ClothingRunner {
    public static void main(String[] args) {
        Clothing clothing = new Clothing("T-Shirt", "M", 500);
        System.out.println(clothing);
        System.out.println(clothing.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(clothing));

        Clothing clothing1 = new Clothing("T-Shirt", "M", 500);
        Clothing clothing2 = new Clothing("T-Shirt", "M", 500);

        boolean same = clothing1.equals(clothing2);
        System.out.println("same:" + same);
    }
}
