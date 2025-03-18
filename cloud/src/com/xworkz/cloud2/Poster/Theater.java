package com.xworkz.cloud2.Poster;

public class Theater {
    void show(Poster poster){
        if(poster != null){
            poster.showinfo();
        }
        else{
            System.out.println("is null cant use");
        }
    }
}
