package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.bangles.Bangles;

public class BanglesRunner {
    public static void main(String[] args) {
        Bangles bangles=new Bangles();
        System.out.println(bangles);
        System.out.println(new Bangles().hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(bangles));
    }
}
