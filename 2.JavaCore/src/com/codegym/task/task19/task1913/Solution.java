package com.codegym.task.task19.task1913;

/* 
Output only digits

*/

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream arr = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(arr);
        System.setOut(stream);

        testString.printSomething();

        String res = arr.toString();
        String result = res.replaceAll("\\D+","");
        System.setOut(consoleStream);
        System.out.println(result);


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("This 1 text 23 is 4 f5-6or7 tes8ting");
        }
    }
}
