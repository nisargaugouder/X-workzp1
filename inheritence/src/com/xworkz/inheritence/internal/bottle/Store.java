package com.xworkz.inheritence.internal.bottle;

public class Store {

    public void pack(Bottle bottle) {
        bottle.fill();
        bottle.storeWater();
        bottle.storeMilk();
        bottle.madeOfGlass();
        bottle.frozen();

        if (bottle instanceof Cap) {
            System.out.println("bottle instance of Cap");
            Cap cap = (Cap) bottle;
            cap.seal();
        }
    }
}
