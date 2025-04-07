package com.xworkz.inheritence.practice;

public class TyreRunner {
    public static void main(String[] args) {
        Rubber rubber=new Rubber();
        rubber.expand();
        Rubber rubber1=new Tyre();
        rubber1.expand();
        //rubber1.compress--error data type rubber-
        Tyre tyre=new Tyre();
        tyre.expand();
        tyre.compress();
        MRFTyre mrfTyre=new MRFTyre();
        mrfTyre.expand();
        mrfTyre.radial();
        mrfTyre.compress();
        System.out.println("-------");

        ArmyVehicle armyVehicle=new ArmyVehicle();
        armyVehicle.wheel(tyre);
        armyVehicle.wheel(tyre);
        armyVehicle.wheel(rubber1);
        armyVehicle.wheel(mrfTyre);

    }
}
