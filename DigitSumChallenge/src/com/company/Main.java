package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(1111));
        System.out.println(sumDigits(32123));
        System.out.println(sumDigits(4));


    }

    public static int sumDigits(int num) {
        if (num < 10) {
            return -1;
        }

        int sum = 0;
        while (num > 0) {
            sum += (num % 10);
            num /= 10;
        }
        return sum;
    }

}
