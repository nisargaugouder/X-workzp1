package com.xworkz;

import com.xworkz.bottle.Bottle;
import com.xworkz.bottle.Material;
import com.xworkz.bottle2.Quantity;

public class BottleRunner {
    public static void main(String[] args) {
        Bottle bottle=new Bottle();
        Material material=new Material();
        material.Plastic();

        Quantity quantity=new Quantity();
        quantity.required();
    }

}
