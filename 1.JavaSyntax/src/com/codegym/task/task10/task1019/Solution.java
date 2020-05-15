package com.codegym.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Functionality is not enough!

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String,Integer> map = new HashMap<>();

        while(true){
            String id= reader.readLine();
            if(id.isEmpty()){
                break;}
            String name="";
             name = reader.readLine();
            map.put(name,Integer.parseInt(id));
            if(name.isEmpty()){
                break;}


            map.put(name,Integer.parseInt(id));
        }
        for (Map.Entry<String,Integer> e:map.entrySet())
            System.out.println(e.getValue()+" "+e.getKey());

    }
}
