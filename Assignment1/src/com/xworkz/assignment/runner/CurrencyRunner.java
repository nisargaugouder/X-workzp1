package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.currency.Currency;

public class CurrencyRunner {
    public static void main(String[] args) {
        Currency currency = new Currency("Rupee", "₹", "India");
        System.out.println(currency);
        System.out.println(currency.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(currency));

        Currency currency1 = new Currency("Dollar", "$", "USA");
        Currency currency2 = new Currency("Euro", "€", "Europe");

        boolean same = currency1.equals(currency2);
        System.out.println("same:" + same);
    }
}
