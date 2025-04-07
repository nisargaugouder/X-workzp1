package com.xworkz.inheritence.internal.frozenBottle;

public class Offer {
    public void good(FrozenBottle frozenBottle){
        frozenBottle.carry();
        frozenBottle.cold();
        frozenBottle.cool();
        frozenBottle.melt();
        frozenBottle.freeze();

        if(frozenBottle instanceof IceBottle){
            System.out.println("frozenBottle instanceof IceBottle");
            IceBottle iceBottle=(IceBottle) frozenBottle;
            iceBottle.costly();
        }
    }
}
