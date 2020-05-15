package com.codegym.task.task14.task1419;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.net.ConnectException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/* 
Exception invasion

*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   // The first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            String string = null;
            File file = new File(string);

        } catch (Exception e) {
            exceptions.add(e);
        } try {
            FileReader FileReader = new FileReader("c:\\folder.txt");

        } catch (Exception e) {
            exceptions.add(e);
        } try {
            int a = Integer.parseInt("a");

        } catch (Exception e) {
            exceptions.add(e);
        } try {
            int[] a = new int[1];
            int b = a[2];

        } catch (Exception e) {
            exceptions.add(e);
        } try {
            throw new ClassCastException()
;
        } catch (Exception e) {
            exceptions.add(e);
        } try {
            throw new ConnectException();

        } catch (Exception e) {
            exceptions.add(e);
        } try {
            throw new SQLException();

        } catch (Exception e) {
            exceptions.add(e);
        } try {
           throw new ConcurrentModificationException();
        } catch (Exception e) {
            exceptions.add(e);
        }
    try {
        throw new ClassNotFoundException();
    } catch (Exception e) {
        exceptions.add(e);
        //write your code here

    }
}}
