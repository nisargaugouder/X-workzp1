package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.lock.Lock;

public class LockRunner {
    public static void main(String[] args) {
        Lock lock = new Lock("Godrej", "Padlock", 250);
        System.out.println(lock);
        System.out.println(lock.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(lock));
    }
}
