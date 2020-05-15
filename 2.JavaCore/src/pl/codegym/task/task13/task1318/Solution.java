package pl.codegym.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Wczytywanie pliku
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inStream = new FileInputStream(reader.readLine());
        while (inStream.available() > 0)
        {
            int data = inStream.read();
        System.out.print(data);}
        // tutaj wpisz swój kod

        inStream.close();
        reader.close();
    }
}