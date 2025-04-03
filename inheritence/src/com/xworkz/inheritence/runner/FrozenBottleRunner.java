package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.frozenBottle.FrozenBottle;
import com.xworkz.inheritence.internal.frozenBottle.IceBottle;

public class FrozenBottleRunner {
    public static void main(String[] args) {
        FrozenBottle bottle = new IceBottle();
        bottle.freezeWater();
        bottle.keepCold();
        bottle.useForCooling();
        bottle.meltSlowly();
        bottle.carryAnywhere();

        System.out.println("-----------------");
        IceBottle iceBottle = new IceBottle();
        iceBottle.freezeWater();
        iceBottle.keepCold();
        iceBottle.useForCooling();
        iceBottle.meltSlowly();
        iceBottle.carryAnywhere();
    }
}
