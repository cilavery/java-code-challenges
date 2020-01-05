package com.company;

public class Main {

    public static void main(String[] args) {
//        System.out.println(sumDigits(125));
        System.out .println(isPalindrome(24));
//        System.out.println(hasSharedDigit(21, 25));
    }

//    public static boolean hasSharedDigit(int numOne, int numTwo) {
//        if ((numOne < 10 || numOne > 99) || (numTwo < 10 || numTwo > 99)) {
//            return false;
//        }
//        boolean hasShared = false;
//        for (int i = 0; i < 2; i++) {
//            int oneDigit = numOne % 10;
//            int tempTwoDigit = numTwo;
//            for (int j = 0; j < 2; j++) {
//                int twoDigit = tempTwoDigit % 10;
//                if (oneDigit == twoDigit) {
//                    hasShared = true;
//                    break;
//                }
//                tempTwoDigit /= 10;
//            }
//            numOne /= 10;
//        }
//        return hasShared;
//    }

    public static boolean isPalindrome(int num) {
        int reverse = 0;
        int numAbs = Math.abs(num);
        while (numAbs > 0) {
            int lastDigit = numAbs % 10;
            reverse *= 10;
            reverse += lastDigit;
            numAbs /= 10;
        }
        System.out.println("reverse: " + reverse);
        if (reverse == Math.abs(num)) {
            return true;
        } else {
            return false;
        }
    }

//    public static int sumDigits(int num) {
//        if (num < 10) {
//            return -1;
//        }
//
//        int sum = 0;
//        while (num > 0) {
//            sum += (num % 10);
//            num /= 10;
//        }
//        return sum;
//    }

}
