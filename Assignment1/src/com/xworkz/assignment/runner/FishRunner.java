package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.fish.Fish;

public class FishRunner {
    public static void main(String[] args) {
        Fish fish = new Fish("GoldFish", "Golden", 0.5);
        System.out.println(fish);
        System.out.println(fish.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(fish));

        Fish fish1 = new Fish("GoldFish", "Golden", 0.5);
        Fish fish2 = new Fish("Betta", "Red", 0.3);

        boolean same = fish1.equals(fish2);
        System.out.println("same:" + same);
    }
}
