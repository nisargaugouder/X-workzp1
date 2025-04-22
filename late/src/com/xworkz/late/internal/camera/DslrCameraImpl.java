package com.xworkz.late.internal.camera;

public class DslrCameraImpl implements Camera {
    public DslrCameraImpl() {
        System.out.println("no-arg const DslrCameraImpl");
    }

    @Override
    public void click() {
        System.out.println("clicking photo in DslrCameraImpl");
    }
}
