package pl.codegym.task.task09.task0903;

/*
Kto mnie wywołał?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();

    }

    public static int method1() {

        method2();
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
        //tutaj wpisz swój kod
    }

    public static int method2() {
        method3();
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
        //tutaj wpisz swój kod
    }

    public static int method3() {
        method4();
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
        //tutaj wpisz swój kod
    }

    public static int method4() {
        method5();
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
        //tutaj wpisz swój kod
    }

    public static int method5() {
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
        //tutaj wpisz swój kod
    }
}

