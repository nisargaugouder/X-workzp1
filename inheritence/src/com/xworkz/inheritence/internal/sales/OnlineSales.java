package com.xworkz.inheritence.internal.sales;

public class OnlineSales extends Sales {
    public OnlineSales() {
        super();
        System.out.println("OnlineSales --child");
    }

    @Override
    public void revenue() {
        System.out.println("OnlineSales generate revenue online --child");
    }

    @Override
    public void marketing() {
        System.out.println("OnlineSales use digital marketing --child");
    }

    @Override
    public void customer() {
        System.out.println("OnlineSales require digital customer engagement --child");
    }

    @Override
    public void discounts() {
        System.out.println("OnlineSales offer exclusive discounts --child");
    }

    @Override
    public void global() {
        System.out.println("OnlineSales happen globally via e-commerce --child");
    }
}
