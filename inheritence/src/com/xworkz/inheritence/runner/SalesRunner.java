package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.sales.Sales;
import com.xworkz.inheritence.internal.sales.OnlineSales;

public class SalesRunner {
    public static void main(String[] args) {
        Sales sales = new Sales();
        sales.revenue();
        sales.marketing();
        sales.customer();
        sales.discounts();
        sales.global();

        System.out.println("-----------");

        Sales sales2 = new OnlineSales();
        sales2.revenue();
        sales2.marketing();
        sales2.customer();
        sales2.discounts();
        sales2.global();

        System.out.println("-----------");

        OnlineSales onlineSales = new OnlineSales();
        onlineSales.revenue();
        onlineSales.marketing();
        onlineSales.customer();
        onlineSales.discounts();
        onlineSales.global();
    }
}
