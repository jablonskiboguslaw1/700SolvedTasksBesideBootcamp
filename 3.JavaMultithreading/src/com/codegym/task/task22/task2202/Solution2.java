package com.codegym.task.task22.task2202;

/* 
Find a substring

*/


    /*
    Find a substring

    */
    public class Solution2 {
        public static void main(String[] args) {
            System.out.println(getPartOfString("CodeGym is the best place to learn Java."));
            System.out.println(getPartOfString("CodeGym is the best place"));
        }

        public static String getPartOfString(String string) {
            if (string == null)
                throw new StringTooShortException();

            String[] subs = string.split(" ");
            if (subs.length < 5)
                throw new StringTooShortException();


            String s = "";
            for (int i = 1; i < 5; i++) {
                if (i == 4) {
                    s+= subs[i];
                } else
                    s += subs[i] + " ";
            }
            return s;
        }

        public static class StringTooShortException extends RuntimeException {
        }
    }