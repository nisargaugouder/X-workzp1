package com.xworkz.inheritence.internal.city;

public class NewYork extends City {
    public NewYork() {
        super();
        System.out.println("Running non-arg constructor NewYork--child");
    }

    @Override
    public void people() {
        System.out.println("City has a large population--child");
    }

    @Override
    public void roads() {
        System.out.println("City has developed infrastructure--child");
    }

    @Override
    public void visit() {
        System.out.println("City attracts tourists--child");
    }

    @Override
    public void life() {
        System.out.println("City has diverse culture--child");
    }

    @Override
    public void business() {
        System.out.println("City boosts the economy--child");
    }
}
