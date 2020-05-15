package com.codegym.task.task22.task2203;

/* 
Between tabs

*/
public class Solution {
    public static String getPartOfString(String string) throws StringTooShortException {
        try{ return string.substring(string.indexOf("\t")+1,string.indexOf("\t",(string.indexOf("\t")+1)));
    }catch (Exception e){
            throw new StringTooShortException();}
        }


    public static class StringTooShortException extends Exception {
    }

    public static void main(String[] args) throws StringTooShortException {
        System.out.println(getPartOfString("\tCodeGym is the best place \tto learn Java\t."));
    }
}