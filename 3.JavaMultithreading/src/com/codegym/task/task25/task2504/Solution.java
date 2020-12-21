package com.codegym.task.task25.task2504;

/* 
A switch for threads

*/
public class Solution {
    public static void processThreads(Thread... threads) {
        for (Thread thred : threads)
            switch (thred.getState()) {
                case NEW:// Implement this method
                    thred.start();
                    break;
                case RUNNABLE:
                    thred.isInterrupted();
                    break;
                case BLOCKED:
                case WAITING:
                case TIMED_WAITING:
                    thred.interrupt();
                break;

                case TERMINATED:
                    System.out.println(thred.getPriority());
                    break;// Implement this method
            }
    }

    public static void main(String[] args) {
    }
}
