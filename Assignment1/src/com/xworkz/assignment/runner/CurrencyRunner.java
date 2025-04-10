package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.currency.Currency;

public class CurrencyRunner {
    public static void main(String[] args) {
        Currency currency = new Currency("Rupee", "₹", "India");
        System.out.println(currency);
        System.out.println(currency.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(currency));
    }
}
