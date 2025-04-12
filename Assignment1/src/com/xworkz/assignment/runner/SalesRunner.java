package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.sales.Sales;

public class SalesRunner {
    public static void main(String[] args) {
        Sales sales = new Sales("Laptop", 150, 7500000.0);
        System.out.println(sales);
        System.out.println(sales.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(sales));

        Sales sales1 = new Sales("Mobile", 200, 5000000.0);
        Sales sales2 = new Sales("Laptop", 150, 7500000.0);

        boolean same = sales1.equals(sales2);
        System.out.println("same: " + same);
    }
}
