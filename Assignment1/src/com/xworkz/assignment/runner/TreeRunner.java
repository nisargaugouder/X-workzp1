package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.tree.Tree;

public class TreeRunner {
    public static void main(String[] args) {
        Tree tree = new Tree("Oak", 15.5, 80);
        System.out.println(tree);
        System.out.println(tree.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(tree));

        Tree tree1 = new Tree("Oak", 15.5, 80);
        Tree tree2 = new Tree("Oak", 15.5, 80);

        boolean same = tree1.equals(tree2);
        System.out.println("same: " + same);
    }
}
