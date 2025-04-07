package com.xworkz.inheritence.internal.elephant;

public class Animal {
    public void habitat(Elephant elephant) {
        elephant.eat();
        elephant.drinkWater();
        elephant.trumpet();
        elephant.useTrunk();
        elephant.walkSlowly();

        if (elephant instanceof AfricanElephant) {
            System.out.println("Elephant is instance of AfricanElephant");
            AfricanElephant africanElephant = (AfricanElephant) elephant;
            africanElephant.tusks();
        }
    }
}
