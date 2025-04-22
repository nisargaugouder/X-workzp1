package com.xworkz.late.internal.consitution;

public class CitizenConstituionImpl implements Consitution{
    public CitizenConstituionImpl(){
        System.out.println("no arg cons of Citizen");
    }
    @Override
    public void followLaws() {
        System.out.println("running followLaws in CitizenConstituionImpl");
    }
}
