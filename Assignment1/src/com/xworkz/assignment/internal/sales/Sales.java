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

    @Override
    public int hashCode() {
        System.out.println("SalesHashCode:"+super.hashCode());
        return 29;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof Sales){
                System.out.println("obj instance of class");
                Sales sales1=this;
                Sales sales2=(Sales) obj;
                if(sales1.product.equals(sales2.product) && sales1.quantitySold==sales2.quantitySold && sales1.totalRevenue==sales2.totalRevenue){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
