package pl.codegym.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Sprawdzanie kolejności
*/
public class Solution {
    public static void main(String[] args) throws IOException {

      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       ArrayList<String> arr = new ArrayList<>();
       for ( int i = 0; i <10;i++)
           arr.add(reader.readLine());

       for (int j =0; j<arr.size()-1;)
           if (arr.get(j).length() < arr.get(j+1).length())
               j++;
           else {System.out.println(j+1);
           break;}

    }
}

