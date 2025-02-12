package pl.codegym.task.task09.task0917;

/*
Obsługiwanie wyjątków typu unchecked
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        obslugaExceptions(new Solution());
    }

    public static void obslugaExceptions(Solution obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (NullPointerException exc) {
            printStos(exc);
        } catch (IndexOutOfBoundsException e) {
            printStos(e);
        } catch (NumberFormatException ex) {
            printStos(ex);
        }
    }
    public static void printStos(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1() {
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }
}

