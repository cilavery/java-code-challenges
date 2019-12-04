package com.company;

public class Main {

    public static void main(String[] args) {
        // occupies 2 bytes of memory or 16 bits and has width of 16 (b/c it stores it in unicode)
        char myChar = 'D';
//        char myUnicode = '\u0044';
        char myUnicode = '\u00a9';
        System.out.println("myUnicode = " + myUnicode);

        boolean myTrueBoo = true;
        boolean myFalseBoo = false;

        boolean isOverTwentyOne = true;
    }
}
