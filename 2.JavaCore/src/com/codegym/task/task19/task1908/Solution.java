package com.codegym.task.task19.task1908;

/* 
Picking out numbers

*/

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
        public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String filename = reader.readLine();
            String outFile = reader.readLine();
            reader.close();

            BufferedReader inpt = new BufferedReader(new FileReader(filename));

            BufferedWriter outp = new BufferedWriter(new FileWriter(outFile));
            String[] arr;
            StringBuilder builder = new StringBuilder();
            while(inpt.ready()){
              builder.append(inpt.readLine());}
            arr= builder.toString().split(" ");
            List<String> list = Arrays.asList(arr);
            List<String> list2 = list.stream().filter(str->str.matches("\\d+")).collect(Collectors.toList());
            list2.forEach(a-> {
                try {
                    outp.write(a+" ");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            inpt.close();
            outp.close();

}}
