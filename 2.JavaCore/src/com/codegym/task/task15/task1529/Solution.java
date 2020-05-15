package com.codegym.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
Mastering the static block

*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
      reset(); //write your code here
    }

    public static CanFly result;

    public static void reset() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String input = reader.readLine();
            if (input.equals("helicopter")) {
                result = new Helicopter();
            } else if (input.equals("plane")) {
                result = new Plane(Integer.parseInt(reader.readLine()));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
//write your code here

