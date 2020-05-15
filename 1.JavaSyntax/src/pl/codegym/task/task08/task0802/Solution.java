package pl.codegym.task.task08.task0802;

/* 
HashMap z 10 par
*/

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
       HashMap<String, String>  cos = new HashMap<>() ;
     cos.put("arbuz","melon");
     cos.put("banan","owoc");
     cos.put("wiśnia","owoc");
     cos.put("gruszka","owoc");
     cos.put("kantalupa","melon");
     cos.put("jeżyna","owoc");
     cos.put("żeńszeń","korzeń");
     cos.put("truskawka","owoc");
     cos.put("irys","kwiat");
     cos.put("ziemniak","bulwa");

       // cos.forEach((key, value) -> System.out.println(key + " - " + value));
for (Map.Entry<String, String> co : cos.entrySet()){
        System.out.println(co.getKey()+co.getValue());

    }
}}
