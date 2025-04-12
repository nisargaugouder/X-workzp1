package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.church.Church;

public class ChurchRunner {
    public static void main(String[] args) {
        Church church = new Church("St. Mary's", "Bangalore", 500);
        System.out.println(church);
        System.out.println(church.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(church));

        Church church1 = new Church("St. Mary's", "Bangalore", 500);
        Church church2 = new Church("St. Mary's", "Bangalore", 500);

        boolean same = church1.equals(church2);
        System.out.println("same:" + same);
    }
}
