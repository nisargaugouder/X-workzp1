package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.curtain.Curtain;

public class CurtainRunner {
    public static void main(String[] args) {
        Curtain curtain = new Curtain("Blue", "Cotton", 7);
        System.out.println(curtain);
        System.out.println(curtain.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(curtain));
    }
}
