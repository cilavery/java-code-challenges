package com.company;

public class Main {

//    public static void main(String[] args) {
//	// write your code here
//        char switchVal = 'R';
//        switch(switchVal) {
//            case 'A':
//                System.out.println("Char is A");
//                break;
//            case 'B':
//                System.out.println("Char is B");
//                break;
//            case 'C':
//                System.out.println("Char is C");
//                break;
//            case 'D': case 'E':
//                System.out.println("Char is D or E");
//                break;
//            default:
//                System.out.println("Char is a letter F or later");
//        }
//    }

    // Day of the Week Challenge
    public static void main(String[] args) {
        printDayOfTheWeek(9);
    }

    // using Switch statement
    private static void printDayOfTheWeek(int day){
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }
    // using if/else
        if (day == 0) {
            System.out.println("Sunday if/else");
        } else if (day == 1) {
            System.out.println("Monday if/else");
        } else if (day == 2) {
            System.out.println("Tuesday if/else");
        } else if (day == 3) {
            System.out.println("Wednesday if/else");
        } else if (day == 4) {
            System.out.println("Thursday if/else");
        } else if (day == 5) {
            System.out.println("Friday if/else");
        } else if (day == 6) {
            System.out.println("Saturday if/else");
        } else {
            System.out.println("Invalid day if/else");
        }
    }
}
