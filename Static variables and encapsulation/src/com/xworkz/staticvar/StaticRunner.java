package com.xworkz.staticvar;

public class StaticRunner {
    public static void main(String[] args) {
        System.out.println("Static Block:" +StaticVar.name);
        StaticVar staticVar=new StaticVar();
        staticVar.total=500;

        StaticVar staticVar1=new StaticVar();
    }
}
