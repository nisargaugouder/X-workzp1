package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.broom.Broom;

public class BroomRunner {
    public static void main(String[] args) {
        Broom broom=new Broom(50,"big","cleaning");
        System.out.println(broom);
        System.out.println(broom.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(broom));

        Broom broom1=new Broom(20,"small","clean");
        Broom broom2=new Broom(30,"big","clean");
        boolean same=broom1.equals(broom2);
        System.out.println("same:"+same);
    }
}
