package com.xworkz.late.external.follow;

import com.xworkz.late.internal.connect.Connect;

public class Network {
    private Connect connect;

    public Network(Connect connect) {
        this.connect = connect;
    }

    public void signal() {
        System.out.println("running signal in Network");
        if (this.connect != null) {
            this.connect.join();
        } else {
            System.out.println("error");
        }
    }
}
