package pl.codegym.task.task09.task0920;

/*
Odliczanie
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
          try {
              Thread.sleep(100);
          }catch (InterruptedException e){

          }
            System.out.println(i);

            //tutaj wpisz swój kod
        }
    }
}
