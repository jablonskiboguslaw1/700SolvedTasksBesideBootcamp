package com.codegym.task.task18.task1822;

/* 
Finding data inside a file

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(scanner.nextLine())));
        String input;
        int id;
        String[] arr;
        do {
            input = reader.readLine();
            arr = input.split(" ");
            id = Integer.parseInt(arr[0]);
        } while (id != Integer.parseInt(args[0]));

        double price = Double.parseDouble(arr[arr.length - 2]);
        int quantity = Integer.parseInt(arr[arr.length - 1]);
        String productName = input
                .replace(id + " ", "")
                .replace(" " + price, "")
                .replace(" " + quantity, "");
        reader.close();
        System.out.println(id+" "+productName+" "+price+" "+quantity);

    }
}
