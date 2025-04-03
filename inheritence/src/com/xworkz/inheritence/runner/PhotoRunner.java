package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.photo.Photo;
import com.xworkz.inheritence.internal.photo.DigitalPhoto;

public class PhotoRunner {
    public static void main(String[] args) {
        Photo photo = new DigitalPhoto();
        photo.capture();
        photo.storeMemory();
        photo.printedOnPaper();
        photo.availableInDigitalFormat();
        photo.sharedOnSocialMedia();

        System.out.println("-----------------");
        DigitalPhoto digitalPhoto = new DigitalPhoto();
        digitalPhoto.capture();
        digitalPhoto.storeMemory();
        digitalPhoto.printedOnPaper();
        digitalPhoto.availableInDigitalFormat();
        digitalPhoto.sharedOnSocialMedia();
    }
}
