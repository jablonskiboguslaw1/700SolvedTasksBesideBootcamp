package com.codegym.task.task08.task0827;

import java.util.Calendar;
import java.util.Date;

/* 
Working with dates

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date date1 = new Date(date);
        Date date2 = new Date(date1.getYear(), Calendar.JANUARY, 0);

        long time = ((date1.getTime() - date2.getTime()) / 1000 / 60 / 60 / 24) % 2;
        if (time == 1)
            return true;
        else return false;
    }
}
