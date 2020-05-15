package com.codegym.task.task18.task1823;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
Threads and bytes

*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException, InterruptedException {

        ReadThread thread;
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
        while (!(input.equals("exit"))) {
            thread = new ReadThread(input);
            thread.start();
            thread.join();
            input=scanner.nextLine();
        }
    }

    public static class ReadThread extends Thread {
        String fileName;
        FileInputStream stream;

        @Override
        public void run() {
            super.run();
        }

        public ReadThread(String fileName) throws IOException, InterruptedException {
            this.fileName = fileName;
            this.stream = new FileInputStream(fileName);

            resultMap.put(fileName, getByte());
            stream.close();


            // Implement constructor body
        }

        public int getByte() throws IOException {
            HashMap<Integer, Integer> map = new HashMap<>();
            Integer value = 1;
            int temp;
            int result = 0;
            while (stream.available() > 0) {
                temp = stream.read();
                if (map.containsKey(temp)) {
                    map.replace(temp, map.get(temp) + 1);
                } else map.put(temp, value);
            }
            int max = 0;
            for (Map.Entry ent : map.entrySet())
                if ((int) ent.getValue() > max)
                    max = (int) ent.getValue();

            for (Map.Entry entr : map.entrySet())
                if ((int) entr.getValue() == max)
                    result = (int) entr.getKey();
            return result;

        } // Implement file reading here
    }
}
