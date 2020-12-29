package com.codegym.task.task25.task2510;

/* 
Wait and see

*/

public class Solution extends Thread {

    public Solution() {
        setUncaughtExceptionHandler(new UncaughtExceptionHandler() {

            @Override
            public void uncaughtException(Thread thread, Throwable e) {

                    if ((e instanceof Throwable) &&(!(e instanceof Exception) && (!(e instanceof Error))))  {
                        System.out.println("Wait and see");}
                       else if (e instanceof Exception) {
                        System.out.println("Needs handling");}
                        if (e instanceof Error) {
                            System.out.println("Can't keep running");
                        }}

                });




    }

    public static void main(String[] args) {
    }
}
