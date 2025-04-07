package com.xworkz.inheritence.internal.heart;

public class Organ {
    public void center(Heart heart){
        heart.beat();
        heart.circulate();
        heart.oxygen();
        heart.pump();
        heart.waste();

        if(heart instanceof HealthyHeart){
            HealthyHeart healthyHeart=(HealthyHeart) heart;
            healthyHeart.color();
        }
    }
}
