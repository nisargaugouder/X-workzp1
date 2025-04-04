package com.xworkz.inheritence.internal.city;

public class City {
    public City() {
        System.out.println("Running non-arg constructor City--parent");
    }

    public void people() {
        System.out.println("City has a large population--parent");
    }

    public void roads() {
        System.out.println("City has developed infrastructure--parent");
    }

    public void visit() {
        System.out.println("City attracts tourists--parent");
    }

    public void life() {
        System.out.println("City has diverse culture--parent");
    }

    public void business() {
        System.out.println("City boosts the economy--parent");
    }
}
