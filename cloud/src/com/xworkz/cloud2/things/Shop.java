package com.xworkz.cloud2.things;

public class Shop {
     void adds(Display display){
        if(display != null){
            display.run();
        }
        else{
            System.out.println("it is null can't use it");
        }

    }
}
