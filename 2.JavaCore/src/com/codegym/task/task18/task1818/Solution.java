package com.codegym.task.task18.task1818;

/* 
Two in one

*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        FileOutputStream fileOutputStream1 = new FileOutputStream(scanner.nextLine());
        FileInputStream fileInputStream2 = new FileInputStream(scanner.nextLine());
        FileInputStream fileInputStream3 = new FileInputStream(scanner.nextLine());

        byte[] bytes = new byte[fileInputStream2.available()];
        while(fileInputStream2.available()>0){
        int count = fileInputStream2.read(bytes);}
        fileOutputStream1.write(bytes);
        fileOutputStream1.close();


        byte[] bytes2 = new byte[fileInputStream3.available()];
        while(fileInputStream3.available()>0){
        int count = fileInputStream3.read(bytes2);}
        fileOutputStream1.write(bytes2);

        fileOutputStream1.close();
        fileInputStream2.close();
        fileInputStream3.close();


    }
}
