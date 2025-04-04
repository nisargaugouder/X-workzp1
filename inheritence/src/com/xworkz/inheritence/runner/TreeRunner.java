package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.tree.Tree;
import com.xworkz.inheritence.internal.tree.Oak;

public class TreeRunner {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.roots();
        tree.branches();
        tree.leaves();
        tree.oxygen();
        tree.lifespan();

        System.out.println("-----------");

        Tree tree2 = new Oak();
        tree2.roots();
        tree2.branches();
        tree2.leaves();
        tree2.oxygen();
        tree2.lifespan();

        System.out.println("-----------");

        Oak oak = new Oak();
        oak.roots();
        oak.branches();
        oak.leaves();
        oak.oxygen();
        oak.lifespan();
    }
}
