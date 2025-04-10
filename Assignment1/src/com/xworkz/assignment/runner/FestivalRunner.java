package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.festival.Festival;

public class FestivalRunner {
    public static void main(String[] args) {
        Festival festival = new Festival("Diwali", 5, "November");
        System.out.println(festival);
        System.out.println(festival.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(festival));
    }
}
