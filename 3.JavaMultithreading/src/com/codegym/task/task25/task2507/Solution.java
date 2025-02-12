package com.codegym.task.task25.task2507;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/* 
Work up a sweat!

*/

public class Solution extends Thread {
    private static final int BUFFER_SIZE = 2000;    // 2000 bytes
    private final Socket socket;
    private final InputStream in;

    public Solution(Socket socket) throws IOException {
        this.socket = socket;
        this.in = socket.getInputStream();
    }

    public void interrupt() {
        try {
            this.socket.close();
            this.in.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            super.interrupt();
        }
        // Implement the logic here
    }

    public void run() {
        try {
            byte[] buf = new byte[BUFFER_SIZE];
            while (true) {
                int count = in.read(buf);
                if (count < 0) {
                    break;
                } else {
                    if (count > 0) {
                        // Process the buffer here
                    }
                }
            }
        } catch (IOException ignored) {}
    }

    public static void main(String[] args) {
    }
}
