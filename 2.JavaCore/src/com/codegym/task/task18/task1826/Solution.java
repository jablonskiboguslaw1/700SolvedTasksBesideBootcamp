package com.codegym.task.task18.task1826;

/* 
Encryption

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(args[1]);

        FileOutputStream fileOutputStream = new FileOutputStream(args[2]);
        while(fileInputStream.available()>0){
        if (args[0].equals("-e"))
            fileOutputStream.write(fileInputStream.read()+1000);
        else if (args[0].equals("-d"))
            fileOutputStream.write(fileInputStream.read()-1000);}
        fileInputStream.close();
        fileOutputStream.close();



    }

}
