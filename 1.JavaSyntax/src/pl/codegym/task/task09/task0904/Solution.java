package pl.codegym.task.task09.task0904;
/*
Ślad stosu z 10 wywołaniami
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        int dlugoscSladuStosu = method1().length - method10().length + 1;

    }

    public static StackTraceElement[] method1() {
        return method2();
    }

    public static StackTraceElement[] method2() {
        return method3();//tutaj wpisz swój kod
    }

    public static StackTraceElement[] method3() {
        return method4() ;//tutaj wpisz swój kod
    }

    public static StackTraceElement[] method4() {
        return method5();//tutaj wpisz swój kod
    }

    public static StackTraceElement[] method5() {
        return method6();//tutaj wpisz swój kod
    }

    public static StackTraceElement[] method6() {
        return method7(); //tutaj wpisz swój kod
    }

    public static StackTraceElement[] method7() {
        return method8(); //tutaj wpisz swój kod
    }

    public static StackTraceElement[] method8() {
        return method9(); //tutaj wpisz swój kod
    }

    public static StackTraceElement[] method9() {
        return method10();
    }

    public static StackTraceElement[] method10() {
        return Thread.currentThread().getStackTrace();
    }
}
