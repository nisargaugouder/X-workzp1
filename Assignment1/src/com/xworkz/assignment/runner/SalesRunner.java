package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.sales.Sales;

public class SalesRunner {
    public static void main(String[] args) {
        Sales sales = new Sales("Laptop", 150, 7500000.0);
        System.out.println(sales);
    }
}
