package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.bedsheet.Bedsheet;
import com.xworkz.inheritence.internal.bedsheet.CottonBedsheet;

public class BedsheetRunner {
    public static void main(String[] args) {
        Bedsheet bedsheet = new CottonBedsheet();
        bedsheet.cover();
        bedsheet.wash();
        bedsheet.fold();
        bedsheet.texture();

        System.out.println("-----------------");
        CottonBedsheet cottonBedsheet = new CottonBedsheet();
        cottonBedsheet.cover();
        cottonBedsheet.wash();
        cottonBedsheet.fold();
        cottonBedsheet.texture();
    }
}
