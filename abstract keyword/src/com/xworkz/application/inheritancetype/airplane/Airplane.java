package com.xworkz.application.inheritancetype.airplane;

public class Airplane extends Vehicle{
    FlyingMachine flyingMachine=new FlyingMachine();

    public void fly(){
        flyingMachine.fly();
    }

}
