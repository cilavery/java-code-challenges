package com.company;

public class Main {

    public static void main(String[] args) {
        // 32 bits or 4 bytes
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println(("Float min val = " + myMinFloatValue));
        System.out.println(("Float max val = " + myMaxFloatValue));


        // 64 bits or 8 bytes
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println(("Double min val = " + myMinDoubleValue));
        System.out.println(("Double max val = " + myMaxDoubleValue));

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;
        System.out.println(("my int val = " + myIntValue));
        System.out.println(("my float val = " + myFloatValue));
        System.out.println(("my double val = " + myDoubleValue));

        int myPound = 200;
        double kiloConvert = 0.45359237d;
        double myKilos = myPound * kiloConvert;
        System.out.println("5 pounds = " + myKilos);


    }
}
