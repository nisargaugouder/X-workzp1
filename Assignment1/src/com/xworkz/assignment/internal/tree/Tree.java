package com.xworkz.assignment.internal.tree;

public class Tree {
    private String species;
    private double height;
    private int age;

    public Tree(String species, double height, int age) {
        this.species = species;
        this.height = height;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "species='" + species + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("TreeHashCode:"+super.hashCode());
        return 8;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof Tree){
                System.out.println("obj instance of class");
                Tree tree1=this;
                Tree tree2=(Tree) obj;
                if(tree1.age==tree2.age && tree1.height==tree2.height && tree1.species.equals(tree2.species)){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
