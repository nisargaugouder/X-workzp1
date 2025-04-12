package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.lock.Lock;

public class LockRunner {
    public static void main(String[] args) {
        Lock lock = new Lock("Godrej", "Padlock", 250);
        System.out.println(lock);
        System.out.println(lock.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(lock));

        Lock lock1 = new Lock("Godrej", "Padlock", 250);
        Lock lock2 = new Lock("Godrej", "Padlock", 250);

        boolean same = lock1.equals(lock2);
        System.out.println("same: " + same);
    }
}
