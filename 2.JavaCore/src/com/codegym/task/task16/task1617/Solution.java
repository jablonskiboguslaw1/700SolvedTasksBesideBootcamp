package com.codegym.task.task16.task1617;

/* 
Countdown at the races

*/

public class Solution {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();//write your code here
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            try {
                while (numSeconds > 0) {
                    System.out.println(numSeconds);
                    Thread.sleep(1000);
                    numSeconds--;
                }
                System.out.println("Go!");

            } catch (InterruptedException e) {
                System.out.println("Interrupted!");
            }//write your code here
        }
    }
}
