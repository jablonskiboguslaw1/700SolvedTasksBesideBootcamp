package com.codegym.task.task16.task1619;

/* 
No interrupt, no dice?

*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterrupt();
    }

    public static void ourInterrupt() throws InterruptedException {
TestThread.isActive=false;
    }

    public static class TestThread implements Runnable {
       static boolean isActive= true;

        public void run() {
            while (isActive) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
