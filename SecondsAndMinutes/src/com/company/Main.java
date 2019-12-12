package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(3945l));
//        System.out.println(getDurationString(65, 45));

    }

    public static String getDurationString(long min, long sec) {
        if (min < 0 || (sec < 0 || sec > 59)) {
            return "Invalid value";
        }

        long remSeconds = sec % 60;
        long remMinutes = min % 60;
        long calcHours = (min / 60);

        return calcHours + "h " + remMinutes + "m " + remSeconds + "s";
    }

    public static String getDurationString(long sec) {
        if (sec < 0) {
            return "Invalid value";
        }

        long minutes = sec / 60;
        long remSeconds = sec % 60;
        return getDurationString(minutes, remSeconds);
    }
}
