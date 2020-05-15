package com.codegym.task.task19.task1915;

/* 
Duplicate text

*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();
        reader.close();
        FileOutputStream writer = new FileOutputStream(path);

        PrintStream cosoleStream = System.out;
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        PrintStream newSteram = new PrintStream(stream);
        System.setOut(newSteram);
        testString.printSomething();
        writer.write(stream.toByteArray());
        System.setOut(cosoleStream);
        System.out.println(stream.toString());
        writer.close();





    }

    public static class TestString {
        public void printSomething() {
            System.out.println("This is text for testing");
        }
    }
}

