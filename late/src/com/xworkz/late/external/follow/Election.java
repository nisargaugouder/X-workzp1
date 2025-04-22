package com.xworkz.late.external.follow;

import com.xworkz.late.internal.bjp.BJP;

public class Election {
    private BJP bjp;

    public Election(BJP bjp) {
        this.bjp = bjp;
    }

    public void vote() {
        System.out.println("Running vote in Election");
        if (this.bjp != null) {
            this.bjp.develop();
        } else {
            System.out.println("Error: bjp is null");
        }
    }
}
