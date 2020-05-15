package com.codegym.task.task17.task1707;

public class IMF {

    private static IMF imf;

    public static IMF getFund() {
        synchronized (IMF.class){
            if(imf ==null)
                imf = new IMF();
        }
        //write your code here
        return imf;
    }

    private IMF() {
    }
}
