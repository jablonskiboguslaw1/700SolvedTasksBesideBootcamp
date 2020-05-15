package com.codegym.task.task32.task3202;

import java.io.*;

/* 
Reading from a stream

*/
public class Solution {
    public static void main(String[] args) throws IOException {
      //  StringWriter writer = getAllDataFromInputStream(null);
        StringWriter writer = getAllDataFromInputStream(new FileInputStream("testFile.log"));
        System.out.println(writer.toString());
       // System.out.println(writer.toString());

    }

    public static StringWriter getAllDataFromInputStream(InputStream is) throws IOException {

        StringWriter stringWriter = new StringWriter();
        if (is==null){
            stringWriter.write("1:0 dla mnie");
        }
        else{
        BufferedReader sb = new BufferedReader(new InputStreamReader(is));
        String line;

        try {
            while ((line = sb.readLine()) != null) {
                stringWriter.write(line);
            }

        } catch (NullPointerException e) {
            e.printStackTrace();
            stringWriter.write("nie ma nulla");

        }}
        stringWriter.close();
        return stringWriter;
    }

}
