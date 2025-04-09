package com.xworkz.assignment.internal.sales;

public class Sales {
    private String product;
    private int quantitySold;
    private double totalRevenue;

    public Sales(String product, int quantitySold, double totalRevenue) {
        this.product = product;
        this.quantitySold = quantitySold;
        this.totalRevenue = totalRevenue;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "product='" + product + '\'' +
                ", quantitySold=" + quantitySold +
                ", totalRevenue=" + totalRevenue +
                '}';
    }
}
