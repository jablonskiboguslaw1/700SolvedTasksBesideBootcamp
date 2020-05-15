package com.codegym.task.task19.task1914;

/* 
Problem solving

*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream arr = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(arr);
        System.setOut(stream);

        testString.printSomething();
        System.setOut(consoleStream);
        String totrim = arr.toString();
        String[] res = arr.toString().split(" ");
        int a = Integer.parseInt(res[0]);
        int b = Integer.parseInt(res[2]);
        String result = "";
        if (res[1] .equals("+")) {
            result = totrim.trim() + " " + (a + b);
        } else if (res[1] .equals("-")) {
            result = totrim.trim() + " " + (a - b);
        } else if (res[1] .equals("*")) {
            result = totrim.trim() + " " + (a * b);
        }
        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

