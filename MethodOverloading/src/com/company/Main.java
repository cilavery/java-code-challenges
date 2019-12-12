package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(59));
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet < 0) {
            return -1;
        }
        if (inches < 0 || inches > 12) {
            return -1;
        }

        double cm = feet * 30.48d;
        double inch = inches * 2.54d;

        return cm + inch;
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {

       if (inches < 0) {
           return -1;
       } else {
           int feet = inches / 12;
           int inch = inches % 12;
           double result = calcFeetAndInchesToCentimeters(feet, inch);
           return result;
       }
    }
}
