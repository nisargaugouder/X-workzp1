package com.xworkz.projector;

public class Battery {
    private boolean charged;
    private int percentage;
    private Voltage voltage;

    public boolean getCharged(){
        return this.charged;
    }
    public void setCharged(boolean charged){
        this.charged=charged;
        charged=true;
    }
    public Battery(int percentage,Voltage voltage){
        this.percentage=percentage;
        this.voltage=voltage;
    }
    public void Batdisplay(){
        System.out.println("Charge:"+this.charged);
        System.out.println("Percentage:"+this.percentage);
        System.out.println("Voltage  from dif class as variable:"+this.voltage);
        voltage.voltDis();
    }
}
