package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.bedsheet.Bedsheet;

public class BedsheetRunner {
    public static void main(String[] args) {
        Bedsheet bedsheet = new Bedsheet();
        System.out.println(bedsheet);
        System.out.println(new Bedsheet().hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(bedsheet));

        Bedsheet bedsheet1=new Bedsheet();
        bedsheet1.setColor("blue");
        Bedsheet bedsheet2=new Bedsheet();
        bedsheet2.setColor("black");
        boolean same=bedsheet1.equals(bedsheet2);
        System.out.println("same:"+same);
    }
}
