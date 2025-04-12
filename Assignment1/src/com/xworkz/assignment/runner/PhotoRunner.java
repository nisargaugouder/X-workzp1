package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.photo.Photo;

public class PhotoRunner {
    public static void main(String[] args) {
        Photo photo = new Photo("Sunset", "Goa", "2025-04-09");
        System.out.println(photo);
        System.out.println(photo.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(photo));

        Photo photo1 = new Photo("Sunset", "Goa", "2025-04-09");
        Photo photo2 = new Photo("Sunset", "Goa", "2025-04-09");

        boolean same = photo1.equals(photo2);
        System.out.println("same: " + same);
    }
}
