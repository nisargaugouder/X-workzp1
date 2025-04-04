package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.photo.Photo;
import com.xworkz.inheritence.internal.photo.DigitalPhoto;

public class PhotoRunner {
    public static void main(String[] args) {
        Photo photo = new Photo();
        photo.capture();
        photo.store();
        photo.print();
        photo.format();
        photo.share();

        System.out.println("-----------");

        Photo photo2 = new DigitalPhoto();
        photo2.capture();
        photo2.store();
        photo2.print();
        photo2.format();
        photo2.share();

        System.out.println("-----------");

        DigitalPhoto digitalPhoto = new DigitalPhoto();
        digitalPhoto.capture();
        digitalPhoto.store();
        digitalPhoto.print();
        digitalPhoto.format();
        digitalPhoto.share();
    }
}
