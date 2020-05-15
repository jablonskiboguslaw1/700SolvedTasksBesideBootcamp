package pl.codegym.task.task08.task0801;

/* 
HashSet roślin
*/

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        HashSet<String> ros = new HashSet<>();
        Collections.addAll(ros,"arbuz","arbuz",
               "banan",
                "wiśnia",
                "gruszka",
                "kantalupa",
                "jeżyna",
                "żeńszeń",
                "truskawka",
                "irys",
                "ziemniak");

        for (String rosliny: ros)
            System.out.println(rosliny);
              {

        }
    }
}
