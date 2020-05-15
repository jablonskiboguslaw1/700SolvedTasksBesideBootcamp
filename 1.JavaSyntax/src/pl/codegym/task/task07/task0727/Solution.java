package pl.codegym.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Zmiana funkcjonalności
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> lista = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            lista.add(s);
        }

        ArrayList<String> duplitripli = new ArrayList<String>();
        for (int i = 0; i < lista.size(); i++) {
            String s = lista.get(i);
            if (lista.get(i).length()%2==0)
            duplitripli.add(s+" "+s);
            else duplitripli.add(s+" "+s+ " "+s);
        }

        for (int i = 0; i < duplitripli.size(); i++) {
            System.out.println(duplitripli.get(i));
        }
    }
}
