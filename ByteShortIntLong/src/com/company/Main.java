package com.company;

public class Main {

    public static void main(String[] args) {

        // occupies 32 bits (has a width of 32)
	    int myMinIntValue = Integer.MIN_VALUE;
	    int myMaxIntValue = Integer.MAX_VALUE;
	    System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println(" Busted Max Value = " + (myMaxIntValue + 1));

        int myMaxTest = 2_147_483_647 + 1;
        System.out.println("My Max Test = " + myMaxTest);

        // occupies 8 bits (has a width of 8)
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Min Value = " + myMinByteValue);
        System.out.println("Byte Max Value = " + myMaxByteValue);


        // occupies 16 bits ( has a width of 16)
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("short Min Value = " + myMinShortValue);
        System.out.println("short Max Value = " + myMaxShortValue);
        
        
        long myLongValue = 100L;
        Long myMinLongValue = Long.MIN_VALUE;
        Long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Min Value = " + myMinLongValue);
        System.out.println("Long Max Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println("Big Long Literal Value = " + bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

        // Primitive Types Challenge;
        byte byteVal = 120;
        short shortVal = 20_000;
        int intVal = 100_000;
        long longVal = 50_000L + (10 * (byteVal + shortVal + intVal));
        System.out.println("Primitive Types Challenge Long Val = " + longVal);
    }
}
