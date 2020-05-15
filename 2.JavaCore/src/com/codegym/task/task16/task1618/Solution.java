package com.codegym.task.task16.task1618;

/* 
Another interruption

*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
       Thread thread = new TestThread();
       thread.start();
       thread.interrupt();//write your code here
    }

    //write your code here
    public static class TestThread extends Thread{

        public void run(){

        }
    }
}