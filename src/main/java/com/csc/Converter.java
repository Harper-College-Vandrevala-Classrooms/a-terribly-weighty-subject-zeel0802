package com.csc;

public class Converter {

    // Method to convert ounces to decimal pounds
    public String toPounds(int ounces) {
        double pounds = ounces / 16.0;
        String unit = (pounds == 1.0) ? "lb" : "lbs";
        return String.format("%.4f %s", pounds, unit);
    }

    // Method to convert ounces to pounds and ounces
    public String toPoundsAndOunces(int ounces) {
        int pounds = ounces / 16;
        int remainingOunces = ounces % 16;
        String poundsUnit = (pounds == 1) ? "lb" : "lbs";
        String ouncesUnit = (remainingOunces == 1) ? "oz" : "oz";
        return pounds + " " + poundsUnit + " " + remainingOunces + " " + ouncesUnit;
    }
}