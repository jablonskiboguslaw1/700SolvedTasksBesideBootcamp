package pl.codegym.task.task09.task0916;

import java.io.IOException;
import java.rmi.RemoteException;

/*
Obsługiwanie wyjątków typu checked
*/

public class Solution {
    public static void main(String[] args) {
        obslugaExceptions(new Solution());

    }

    public static void obslugaExceptions(Solution obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();

        } catch (RemoteException exc) {
            System.out.println("RemoteException");
        } catch (IOException e) {
            System.out.println("IOException");
        } catch (NoSuchFieldException ex) {
            System.out.println("NoSuchFieldException");}
    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
