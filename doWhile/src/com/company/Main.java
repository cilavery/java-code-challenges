package com.company;

public class Main {

    public static void main(String[] args) {
        int num = 4;
        int end = 20;
        int count = 0;
        while (num  <= end) {
            num++;
            if (!isEven(num)) {
                continue;
            }
            System.out.println(num);
            count++;
            if (count >= 5) {
                break;
            }
        }
        System.out.println("count: " + count);
    }


    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
