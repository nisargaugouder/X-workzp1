package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.panipuri.Panipuri;

public class PanipuriRunner {
    public static void main(String[] args) {
        Panipuri panipuri = new Panipuri("Potato", "Mint", 6);
        System.out.println(panipuri);
        System.out.println(panipuri.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(panipuri));
    }
}
