package pl.codegym.task.task14.task1414;

/* 
MovieFactory
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       String key = scanner.nextLine();// Wczytuje parę kluczy (ciągów) z konsoli. Punkt 7


while(key.equals("cartoon")|| key.equals("thriller")|| key.equals("soapOpera")){
        MovieFactory.getMovie(key);
key = scanner.nextLine();}
       try{ MovieFactory.getMovie(key);}
       catch (Exception e){
           e.printStackTrace();
       }

        /*
            8. Tworzy zmienną movie w klasie Movie i dla każdego wprowadzonego ciągu (klucza):
            8.1. Pobiera obiekt za pomocą MovieFactory.getMovie i przypisuje go do zmiennej movie.
            8.2. Wyświetla wynik wywoływania metody movie.getClass().getSimpleName().
        */

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            // Tworzy obiekt SoapOpera dla klucza "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }
            if ("thriller".equals(key)) {
                movie = new Thriller();
            }
            if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }

            //tutaj wpisz swój kod. Punkty 5 i 6
            System.out.println(movie.getClass().getSimpleName());
            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {
    }

    static class Thriller extends Movie {
    }
}

// Tutaj napisz swoje klasy Punkt 3
