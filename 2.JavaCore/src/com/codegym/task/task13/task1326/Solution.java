package com.codegym.task.task13.task1326;

/* 
Sorting even numbers from a file

*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    //public static final String C_USERS_BOGUS_DESKTOP = "C:\\Users\\Bogus\\Desktop\\nums.txt";

    public static void main(String[] args) throws IOException {

         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File(reader.readLine());

        FileInputStream stream = new FileInputStream(file);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(stream));

        List<Integer> list = new ArrayList<>();
        int x=-1;
        while (bufferedReader.ready()) {
            String tmp = bufferedReader.readLine();
            if (!tmp.equals("")) {
                x = Integer.parseInt(tmp);
            }
            if (x % 2 == 0) {
                list.add(x);
            }
        }
        list.sort(Integer::compareTo);
        //write your code here
        stream.close();

        for (Integer in : list) {
            System.out.println(in);
        }
    }
}
