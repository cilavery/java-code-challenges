package com.company;

public class Main {

    public static void main(String[] args) {
//        numberToWords(15);
//        numberToWords(0);
        numberToWords(10);

    }

        public static void numberToWords(int num) {
            if (num < 0) {
                System.out.println("Invalid Value");
            }

            int revNum = reverse(num);
            int count = getDigitCount(num);

            while (revNum > 0) {
                int digit = revNum % 10;
                switch (digit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                revNum /= 10;
                count--;
            }

            for (int i = 0; i < count; i++) {
                System.out.println("Zero");
            }
        }

        public static int reverse(int num) {
            if (num < 10 && num >= 0) {
                return num;
            }

            int reverse = 0;
            int numAbs = Math.abs(num);
            while (numAbs > 0) {
                int lastDigit = numAbs % 10;
                reverse *= 10;
                reverse += lastDigit;
                numAbs /= 10;
            }
            if (num < 0) {
                return 0 - reverse;
            } else {
                return reverse;
            }
        }

        public static int getDigitCount(int num) {
            if (num < 0) {
                return -1;
            }

            int count = 0;
            do {
                num /= 10;
                count++;
            }
            while (num > 0);
            return count;
        }


}
