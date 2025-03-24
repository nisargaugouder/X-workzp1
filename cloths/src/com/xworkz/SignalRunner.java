package com.xworkz;

import com.xworkz.signal.Place;
import com.xworkz.signal.Time;
import com.xworkz.signal2.City;

public class SignalRunner {
    public static void main(String[] args) {
        Place place=new Place();
        Time time=new Time();
        time.Red();

        City city=new City();
        city.colors();
    }
}
