package com.xworkz.inheritence.internal.building;

public class Pg {
    public void ladies(Building building){
        building.floors();
        building.foundation();
        building.rooms();
        building.shelter();
        building.structure();

        if(building instanceof House){
            System.out.println("building instanceof House");
            House house=(House) building;
            house.door();
        }
    }
}
