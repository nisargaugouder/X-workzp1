package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.curtain.Curtain;

public class CurtainRunner {
    public static void main(String[] args) {
        Curtain curtain = new Curtain("Blue", "Cotton", 7);
        System.out.println(curtain);
        System.out.println(curtain.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(curtain));

        Curtain curtain1 = new Curtain("Blue", "Cotton", 7);
        Curtain curtain2 = new Curtain("Blue", "Cotton", 7);

        boolean same = curtain1.equals(curtain2);
        System.out.println("same:" + same);
    }
}
