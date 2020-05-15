package pl.codegym.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Numer miesiąca
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       Map<Integer,String> miesiace = new HashMap<>();
       miesiace.put(1,"Styczeń");
       miesiace.put(2,"Luty");
       miesiace.put(3,"Marzec");
       miesiace.put(4,"Kwiecień");
       miesiace.put(5,"Maj");
       miesiace.put(6,"Czerwiec");
       miesiace.put(7,"Lipiec");
       miesiace.put(8,"Sierpień");
       miesiace.put(9,"Wrzesień");
       miesiace.put(10,"Październik");
       miesiace.put(11,"Listopad");
       miesiace.put(12,"Grudzień");

       Scanner keybod = new Scanner(System.in);
       String wprowadzonyMiesiac =keybod.nextLine();
        for (Map.Entry<Integer,String> miesiac: miesiace.entrySet())
             if( miesiac.getValue().equals(wprowadzonyMiesiac))
                 System.out.println(miesiac.getValue()+" to miesiąc nr "+miesiac.getKey());{

        }}
}
