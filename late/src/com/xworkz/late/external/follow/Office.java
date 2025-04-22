package com.xworkz.late.external.follow;

import com.xworkz.late.internal.canon.Canon;

public class Office {
    private Canon canon;

    public Office(Canon canon) {
        this.canon = canon;
    }

    public void manageDocs() {
        System.out.println("running manageDocs in Office");
        if (this.canon != null) {
            this.canon.print();
        } else {
            System.out.println("error");
        }
    }
}
