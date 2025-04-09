package com.xworkz.assignment.internal.heart;

public class Heart {
    private int beatsPerMinute;
    private String condition;
    private boolean isHealthy;

    public Heart(int beatsPerMinute, String condition, boolean isHealthy) {
        this.beatsPerMinute = beatsPerMinute;
        this.condition = condition;
        this.isHealthy = isHealthy;
    }

    @Override
    public String toString() {
        return "Heart{" +
                "beatsPerMinute=" + beatsPerMinute +
                ", condition='" + condition + '\'' +
                ", isHealthy=" + isHealthy +
                '}';
    }
}
