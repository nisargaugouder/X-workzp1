package com.xworkz.assignment.internal.currency;

public class Currency {
    private String name;
    private String symbol;
    private String country;

    public Currency(String name, String symbol, String country) {
        this.name = name;
        this.symbol = symbol;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
