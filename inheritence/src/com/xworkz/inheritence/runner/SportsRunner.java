package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.sports.Sports;
import com.xworkz.inheritence.internal.sports.Football;

public class SportsRunner {
    public static void main(String[] args) {
        Sports sport = new Sports();
        sport.play();
        sport.rules();
        sport.competition();
        sport.team();
        sport.training();

        System.out.println("-----------");

        Sports sport2 = new Football();
        sport2.play();
        sport2.rules();
        sport2.competition();
        sport2.team();
        sport2.training();

        System.out.println("-----------");

        Football football = new Football();
        football.play();
        football.rules();
        football.competition();
        football.team();
        football.training();
    }
}
