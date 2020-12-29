package com.codegym.task.task25.task2508;

public class TaskManipulator implements Runnable, CustomThreadManipulator {
    private Thread thread;
    @Override
    public void run() {
        try {
            while(!Thread.interrupted()){
            System.out.println(Thread.currentThread().getName());

                Thread.currentThread().sleep(100);}
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    @Override
    public void start(String threadName) {
        thread = new Thread(new TaskManipulator(),threadName);
        thread.start();

    }

    @Override
    public void stop() {
        thread.interrupt();
    }



}
