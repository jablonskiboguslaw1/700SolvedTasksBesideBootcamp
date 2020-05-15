package com.codegym.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread(new Thread1()));
        threads.add(new Thread(new Thread2()));
        threads.add(new Thread(new Thread3()));
        threads.add(new Thread4());
        threads.add(new Thread(new Thread5()));
    }

    public static void main(String[] args) {
    }

    public static class Thread1 implements Runnable {
        @Override
        public void run() {
            while (true) ;
        }
    }

    public static class Thread2 implements Runnable {
        @Override
        public void run() {
            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class Thread3 implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("Hurray");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


    public static class Thread5 implements Runnable {
        @Override
        public void run() {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;
            String tmp;
            try {
                while (true){
                    tmp= reader.readLine();
                    if (!tmp.equals("N")) {
                        sum += Integer.parseInt(tmp);
                    } else{
                        System.out.println(sum);
                break;}}
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
    }


    public static class Thread4 extends Thread implements Message {
        boolean isAlive = this.isAlive();

        @Override
        public void run() {
            while (!interrupted()) ;

        }

        @Override
        public void showWarning() {
            interrupt();
        }
    }
}


