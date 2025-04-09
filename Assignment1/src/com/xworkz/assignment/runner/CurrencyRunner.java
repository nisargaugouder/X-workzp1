package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.currency.Currency;

public class CurrencyRunner {
    public static void main(String[] args) {
        Currency currency = new Currency("Rupee", "₹", "India");
        System.out.println(currency);
    }
}
