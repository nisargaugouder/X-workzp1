package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.frozenBottle.FrozenBottle;
import com.xworkz.inheritence.internal.frozenBottle.IceBottle;

public class FrozenBottleRunner {
    public static void main(String[] args) {
        FrozenBottle bottle = new FrozenBottle();
        bottle.freeze();
        bottle.cold();
        bottle.cool();
        bottle.melt();
        bottle.carry();

        System.out.println("-----------------");

        FrozenBottle bottle2 = new IceBottle();
        bottle2.freeze();
        bottle2.cold();
        bottle2.cool();
        bottle2.melt();
        bottle2.carry();

        System.out.println("-----------------");

        IceBottle iceBottle = new IceBottle();
        iceBottle.freeze();
        iceBottle.cold();
        iceBottle.cool();
        iceBottle.melt();
        iceBottle.carry();
    }
}
