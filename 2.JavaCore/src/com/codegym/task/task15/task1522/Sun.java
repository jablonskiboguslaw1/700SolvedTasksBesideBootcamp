package com.codegym.task.task15.task1522;

public class Sun implements Planet{

    private static volatile Sun instance;

    private Sun() {
    }

    public static synchronized Sun getInstance() {
        if (instance==null)
            instance = new Sun();
        return instance;
    }


}
