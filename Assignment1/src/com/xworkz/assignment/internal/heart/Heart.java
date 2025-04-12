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

    @Override
    public int hashCode() {
        System.out.println("HeartHashCode:"+super.hashCode());
        return 64;
    }
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Heart){
                System.out.println("have ref.will compare..");
                Heart heart1=this;
                Heart heart2=(Heart) obj;
                if(heart1.isHealthy==heart2.isHealthy && heart1.beatsPerMinute==heart2.beatsPerMinute){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
