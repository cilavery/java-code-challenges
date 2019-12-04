package com.company;

public class Main {

        public static void main(String[] args) {
            System.out.println(isLeapYear(1924));
        }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }


//    public static void main(String[] args) {
////       boolean gameOver = true;
////       int score = 800;
////       int levelCompleted = 5;
////       int bonus = 100;
//
//       calculateScore(true, 800, 5, 100);
//        System.out.println(calculateScore(false, 10000, 8,200));
//
//        int position = calculateHighScorePosition(1500);
//        displayHighScorePosition("Mary", position);
//
//        position = calculateHighScorePosition(900);
//        displayHighScorePosition("Joe", position);
//
//        position = calculateHighScorePosition(400);
//        displayHighScorePosition("Alex", position);
//
//        position = calculateHighScorePosition(500);
//        displayHighScorePosition("Grady", position);
//    }
//
//
//    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//        int finalScore = -1;
//
//        if (gameOver) {
//            finalScore = score + (levelCompleted * bonus);
//            finalScore += 2000;
//            System.out.println("your final score was " + finalScore);
//        }
//        return finalScore;
//
//    }
//
//    public static void displayHighScorePosition(String name, int position) {
//        System.out.println(name + " managed to get into position " + position);
//    }
//
//    public static int calculateHighScorePosition(int score) {
//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        } else {
//            return 4;
//        }
//    }
}
