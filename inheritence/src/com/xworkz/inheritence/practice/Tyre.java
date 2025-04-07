package com.xworkz.inheritence.practice;

public class Tyre extends Rubber {
    public Tyre(){
        System.out.println("non-arg cont of Tyre");
    }
    @Override
    public void expand(){
        System.out.println("running expand in tyre--child");
    }
    public void compress(){

    }
}

