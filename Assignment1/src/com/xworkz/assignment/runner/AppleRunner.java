package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.apple.Apple;

public class AppleRunner {
    public static void main(String[] args) {
        Apple a=new Apple();
        System.out.println(a);
        System.out.println(new Apple().hashCode());
        System.out.println("original hashCode:"+System.identityHashCode(a));

        Apple apple1=new Apple();
        apple1.setSweet(true);
        Apple apple2=new Apple();
        apple2.setSweet(false);
        boolean same=apple1.equals(apple2);
        System.out.println("both same:"+same);
    }
}
