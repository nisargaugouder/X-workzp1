package com.xworkz.late.external.follow;

import com.xworkz.late.internal.leaf.Leaf;

public class Tree {
    private Leaf leaf;

    public Tree(Leaf leaf) {
        this.leaf = leaf;
    }

    public void grow() {
        System.out.println("Running grow in Tree");
        if (this.leaf != null) {
            this.leaf.photosynthesize();
        } else {
            System.out.println("error");
        }
    }
}
