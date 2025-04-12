package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.continent.Continent;

public class ContinentRunner {
    public static void main(String[] args) {
        Continent continent = new Continent("Asia", 44579000, 48);
        System.out.println(continent);
        System.out.println(continent.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(continent));

        Continent continent1 = new Continent("Europe", 10180000, 44);
        Continent continent2 = new Continent("Africa", 30370000, 54);

        boolean same = continent1.equals(continent2);
        System.out.println("same:" + same);
    }
}
