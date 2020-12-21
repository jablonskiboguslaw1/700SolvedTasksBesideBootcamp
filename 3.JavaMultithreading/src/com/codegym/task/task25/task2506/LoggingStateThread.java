package com.codegym.task.task25.task2506;

public class LoggingStateThread extends Thread {
    private Thread monitoredThread;

    public LoggingStateThread(Thread monitoredThread) {
        this.monitoredThread = monitoredThread;
    }

    @Override
    public void run() {
        State state = monitoredThread.getState();
        System.out.println(state);

        while (!state.equals(State.TERMINATED)) {
State current = monitoredThread.getState();
            if (!state.equals(current)) {
                System.out.println(current);
                state = current;
            }
        }
        super.run();
    }
}
