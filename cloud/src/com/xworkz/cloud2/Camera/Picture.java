package com.xworkz.cloud2.Camera;

public class Picture {
    void pic(Camera camera){
        if(camera!=null){
            camera.cam();
        }
        else{
            System.out.println("is null");
        }
    }
}
