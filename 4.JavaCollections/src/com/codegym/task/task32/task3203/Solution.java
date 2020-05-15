package com.codegym.task.task32.task3203;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;

/*
Writing a stack trace

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        String text = getStackTrace(new IndexOutOfBoundsException("fff"));
        System.out.println(text);
    }

    public static String getStackTrace(Throwable throwable) throws IOException {
 StringWriter writer = new StringWriter();
 throwable.printStackTrace(new PrintWriter(writer));
return writer.toString();


    }
}