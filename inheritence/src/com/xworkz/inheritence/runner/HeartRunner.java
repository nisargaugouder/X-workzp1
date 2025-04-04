package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.heart.Heart;
import com.xworkz.inheritence.internal.heart.HealthyHeart;

public class HeartRunner {
    public static void main(String[] args) {
        Heart heart = new Heart();
        heart.pump();
        heart.beat();
        heart.oxygen();
        heart.waste();
        heart.circulate();

        System.out.println("-----------");

        Heart heart2 = new HealthyHeart();
        heart2.pump();
        heart2.beat();
        heart2.oxygen();
        heart2.waste();
        heart2.circulate();

        System.out.println("-----------");

        HealthyHeart healthyHeart = new HealthyHeart();
        healthyHeart.pump();
        healthyHeart.beat();
        healthyHeart.oxygen();
        healthyHeart.waste();
        healthyHeart.circulate();
    }
}
