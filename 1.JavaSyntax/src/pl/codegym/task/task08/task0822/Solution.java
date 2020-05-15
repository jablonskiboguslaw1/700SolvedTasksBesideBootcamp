package pl.codegym.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Najmniejsza z N liczb
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> listLiczbCalkowitych = getListLiczbCalkowitych();
        int minimum = getMinimum(listLiczbCalkowitych);
        System.out.println(minimum);
}

    public static int getMinimum(List<Integer> array) {
        int minimum = array.get(0);
      for (int i = 0; i<array.size();i++){
          if (array.get(i)<minimum)
              minimum = array.get(i);}
          return minimum;
    }

    public static List<Integer> getListLiczbCalkowitych() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        int liczbaLiczb = keyboard.nextInt();
        ArrayList<Integer> listaLiczb = new ArrayList<>();
        for (int i =0; i<liczbaLiczb;i++)
            listaLiczb.add(keyboard.nextInt());// Tworzy i inicjalizuje listę
        return listaLiczb;
    }
}
