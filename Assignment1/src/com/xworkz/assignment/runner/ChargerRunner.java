package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.charger.Charger;

public class ChargerRunner {
    public static void main(String[] args) {
        Charger charger = new Charger("Samsung", 5, true);
        System.out.println(charger);
    }
}
