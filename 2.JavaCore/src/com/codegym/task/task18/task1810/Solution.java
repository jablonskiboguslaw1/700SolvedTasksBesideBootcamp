package com.codegym.task.task18.task1810;

/* 
DownloadException

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            FileInputStream input = new FileInputStream(reader.readLine());
            if (input.available() < 1000) {
                input.close();
                throw new DownloadException();
            }
            int count = input.read();
            input.close();

        }
    }

    public static class DownloadException extends Exception {

    }
}
