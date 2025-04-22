package com.xworkz.late.external.follow;

import com.xworkz.late.internal.camera.Camera;

public class Studio {
    private Camera camera;

    public Studio(Camera camera) {
        this.camera = camera;
    }

    public void shoot() {
        System.out.println("running shoot in Studio");
        if (this.camera != null) {
            this.camera.click();
        } else {
            System.out.println("error");
        }
    }
}
