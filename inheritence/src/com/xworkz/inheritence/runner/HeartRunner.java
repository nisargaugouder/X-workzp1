package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.heart.Heart;
import com.xworkz.inheritence.internal.heart.HealthyHeart;

public class HeartRunner {
    public static void main(String[] args) {
        Heart heart = new HealthyHeart();
        heart.pumpsBlood();
        heart.beatsContinuously();
        heart.suppliesOxygen();
        heart.removesWaste();
        heart.worksInCirculatorySystem();

        System.out.println("-----------------");
        HealthyHeart healthyHeart = new HealthyHeart();
        healthyHeart.pumpsBlood();
        healthyHeart.beatsContinuously();
        healthyHeart.suppliesOxygen();
        healthyHeart.removesWaste();
        healthyHeart.worksInCirculatorySystem();
    }
}
