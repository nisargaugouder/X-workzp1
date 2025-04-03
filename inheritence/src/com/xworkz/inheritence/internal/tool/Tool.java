package com.xworkz.inheritence.internal.tool;

public class Tool {
    public Tool() {
        System.out.println("Running non-arg constructor of Tool");
    }
    public void use() {
        System.out.println("Tool is used for work");
    }
    public void material() {
        System.out.println("Tool is made of metal or plastic");
    }
    public void grip() {
        System.out.println("Tool has a grip");
    }
    public void durability() {
        System.out.println("Tool should be durable");
    }
}
