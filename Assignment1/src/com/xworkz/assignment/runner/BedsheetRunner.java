package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.bedsheet.Bedsheet;

public class BedsheetRunner {
    public static void main(String[] args) {
        Bedsheet bedsheet = new Bedsheet();
        System.out.println(bedsheet);
        System.out.println(new Bedsheet().hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(bedsheet));
    }
}
