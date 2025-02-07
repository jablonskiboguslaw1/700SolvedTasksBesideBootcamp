package pl.codegym.task.task08.task0808;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
10 tysięcy usunięć i wstawień
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        wstaw10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        usun10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        wstaw10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        usun10000(linkedList);
    }

    public static void wstaw10000(List lista) {
        for (int i =1 ;i<=10000;i++)
            lista.add("add");//tutaj wpisz swój kod

    }

    public static void get10000(List lista) {
        for (int i =0; i<=9999;i++)
            lista.get(i);//tutaj wpisz swój kod

    }

    public static void set10000(List lista) {
        for (int i =0; i<=9999;i++)
            lista.set(i,"set");//tutaj wpisz swój kod

    }

    public static void usun10000(List lista) {
        for (int i =9999; i>=0;i--)
            lista.remove(i);//tutaj wpisz swój kod

    }
}
