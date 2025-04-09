package com.xworkz.assignment.internal.panipuri;

public class Panipuri {
    private String filling;
    private String waterFlavor;
    private int quantity;

    public Panipuri(String filling, String waterFlavor, int quantity) {
        this.filling = filling;
        this.waterFlavor = waterFlavor;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Panipuri{" +
                "filling='" + filling + '\'' +
                ", waterFlavor='" + waterFlavor + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
