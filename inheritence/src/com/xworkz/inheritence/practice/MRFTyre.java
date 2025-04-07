package com.xworkz.inheritence.practice;

public class MRFTyre extends Tyre{
    public MRFTyre(){
        System.out.println("non-arg cont MrfTyre");
    }

    @Override
    public void expand(){
        System.out.println("run expand in MRFTyre");
    }
    public void radial(){

    }

}
