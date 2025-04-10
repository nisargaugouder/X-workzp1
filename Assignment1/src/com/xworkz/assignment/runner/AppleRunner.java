package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.apple.Apple;

public class AppleRunner {
    public static void main(String[] args) {
        Apple a=new Apple();
        System.out.println(a);
        System.out.println(new Apple().hashCode());
        System.out.println("original hashCode:"+System.identityHashCode(a));
    }
}
