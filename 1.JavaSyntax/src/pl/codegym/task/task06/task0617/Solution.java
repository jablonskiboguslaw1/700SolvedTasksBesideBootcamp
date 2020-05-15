package pl.codegym.task.task06.task0617;

/* 
Notes na nowe idee
*/

public class Solution {
    public static void main(String[] args) {
        printIdea(new Idea());
    }

 public static class Idea{
        public String opis = "coś";
        public String getOpis(){
            return opis;
        }
 }
 public static void printIdea(Idea idea){
     System.out.println(idea.getOpis());
 }//tutaj wpisz swój kod
}
