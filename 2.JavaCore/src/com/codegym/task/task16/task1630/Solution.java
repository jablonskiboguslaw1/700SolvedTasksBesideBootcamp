package com.codegym.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //write your code here

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();//write your code here
        System.out.println(f.getFileContents());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContents();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        String fileName;
        String fileContents="";

        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;

        }

        @Override
        public String getFileContents() {

            return fileContents;
        }

        @Override
        public void run() {

            try {
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                while (reader.ready())
                    fileContents += (reader.readLine() + " ");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //write your code here
}
