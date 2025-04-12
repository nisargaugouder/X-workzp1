package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.watch.Watch;

public class WatchRunner {
    public static void main(String[] args) {
        Watch watch = new Watch("Rolex", "Analog", 500000.0);
        System.out.println(watch);
        System.out.println(watch.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(watch));

        Watch watch1 = new Watch("Rolex", "Analog", 500000.0);
        Watch watch2 = new Watch("Rolex", "Analog", 500000.0);

        boolean same = watch1.equals(watch2);
        System.out.println("same: " + same);
    }
}
