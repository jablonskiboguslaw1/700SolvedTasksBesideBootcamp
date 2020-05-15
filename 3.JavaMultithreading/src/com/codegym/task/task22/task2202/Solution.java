package com.codegym.task.task22.task2202;

/* 
Find a substring

*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("CodeGym is the best place to learn Java."));
        System.out.println(getPartOfString("CodeGym is the best place"));
    }

    public static String getPartOfString(String string) {
        if (string==null)
            throw new StringTooShortException();
        String[] strings = string.split(" ");
        StringBuilder stringBuilder= new StringBuilder();
        if (strings.length<5)
            throw new StringTooShortException();
        else {
            for (int i = 1; i < 4; i++) {
                stringBuilder.append(strings[i]);
                stringBuilder.append(" ");
            }stringBuilder.append(strings[4]);
        }
        return stringBuilder.toString();
    }

    public static class StringTooShortException extends RuntimeException{
    }
}