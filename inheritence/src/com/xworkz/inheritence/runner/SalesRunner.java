package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.sales.Sales;
import com.xworkz.inheritence.internal.sales.OnlineSales;

public class SalesRunner {
    public static void main(String[] args) {
        Sales sales = new OnlineSales();
        sales.generateRevenue();
        sales.involveMarketing();
        sales.requireCustomerEngagement();
        sales.includeDiscounts();
        sales.happenGlobally();

        System.out.println("-----------------");
        OnlineSales onlineSales = new OnlineSales();
        onlineSales.generateRevenue();
        onlineSales.involveMarketing();
        onlineSales.requireCustomerEngagement();
        onlineSales.includeDiscounts();
        onlineSales.happenGlobally();
    }
}
