package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.watch.Watch;

public class WatchRunner {
    public static void main(String[] args) {
        Watch watch = new Watch("Rolex", "Analog", 500000.0);
        System.out.println(watch);
        System.out.println(watch.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(watch));
    }
}
