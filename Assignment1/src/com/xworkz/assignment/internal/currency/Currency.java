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

    @Override
    public int hashCode() {
        System.out.println("CurrencyHashCode:"+super.hashCode());
        return 875;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Currency){
                System.out.println("have ref.will compare..");
                Currency currency1=this;
                Currency currency2=(Currency) obj;
                if(currency1.name.equals(currency2.name)){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
