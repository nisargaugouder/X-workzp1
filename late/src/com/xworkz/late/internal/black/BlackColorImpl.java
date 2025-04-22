package com.xworkz.late.internal.black;

public class BlackColorImpl implements Black {
    public BlackColorImpl() {
        System.out.println("no-arg constructor of BlackColorImpl");
    }

    @Override
    public void dark() {
        System.out.println("This is a deep black color");
    }
}
