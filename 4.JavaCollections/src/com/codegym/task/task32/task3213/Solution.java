package com.codegym.task.task32.task3213;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

/* 
Caesar cipher

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        StringReader reader = new StringReader("Khoor#Dpljr#&C,₷B'3");
        String cos = null;
        StringReader reader3= new StringReader(cos);
        StringReader reader2 = null;
        System.out.println(decode(reader, -3));  // Hello Amigo #@)₴?$0
        System.out.println(decode(reader3,2));
    }

    public static String decode(StringReader reader, int key) throws IOException {
        if (reader == null){
            return "nic";
        }else {
            StringBuilder sb = new StringBuilder();
        int value;
       try {
           while ((value = reader.read()) > 0) {
               sb.append((char) (value + key));
           }
           return sb.toString();
       }catch (NullPointerException e){

           return "mam Cię";
       }


    }}

}

