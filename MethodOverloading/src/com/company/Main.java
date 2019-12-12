package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(72) + " cm");
        System.out.println(calcFeetAndInchesToCentimeters(10, 20));

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || (inches < 0 || inches > 12)) {
            System.out.println("invalid feet and inches");
            return -1;
        }

        double cmFromFeet = feet * 30.48d;
        double cmFromInches = inches * 2.54d;

        return cmFromFeet + cmFromInches;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        if (inches < 0) {
            System.out.println("invalid inches input");
            return -1;
        } else {
            double feet = (int) inches / 12;
            double remainInches = (int) inches % 12;
            return calcFeetAndInchesToCentimeters(feet, remainInches);
        }
    }
}
