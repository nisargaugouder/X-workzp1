package com.xworkz.inheritence.runner.bottle;

import com.xworkz.inheritence.internal.bottle.Bottle;
import com.xworkz.inheritence.internal.bottle.Cap;

public class BottleRunner {
    public static void main(String[] args) {
        System.out.println("---------- Bottle ----------");
        Bottle bottle = new Bottle();
        bottle.fill();
        bottle.storeWater();
        bottle.storeMilk();
        bottle.madeOfGlass();
        bottle.frozen();

        System.out.println("---------- Cap ----------");
        Bottle cap = new Cap();
        cap.fill();
        cap.storeWater();
        cap.storeMilk();
        cap.madeOfGlass();
        cap.frozen();

        System.out.println("---------- Direct Cap ----------");
        Cap directCap = new Cap();
        directCap.fill();
        directCap.storeWater();
        directCap.storeMilk();
        directCap.madeOfGlass();
        directCap.frozen();
    }
}
