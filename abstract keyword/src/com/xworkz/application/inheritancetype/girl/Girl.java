package com.xworkz.application.inheritancetype.girl;

public class Girl extends Human {
    Emotion emotion = new Emotion();

    public void express() {
        emotion.show();
    }
}
