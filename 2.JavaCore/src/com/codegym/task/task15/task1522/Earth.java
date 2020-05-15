package com.codegym.task.task15.task1522;

public class Earth implements Planet{

    private static volatile Earth instance;

    private Earth(){};

    public static synchronized Earth getInstance(){
        if (instance==null)
           instance = new Earth();
        return instance;}

}
