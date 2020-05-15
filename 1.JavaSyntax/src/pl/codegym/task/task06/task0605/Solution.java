package pl.codegym.task.task06.task0605;

import java.io.*;

/* 
Kontrola wagi ciała
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double waga = Double.parseDouble(bis.readLine());
        double wzrost = Double.parseDouble(bis.readLine());

        Cialo.obliczBMI(waga, wzrost);
    }

    public static class Cialo {
        public static void obliczBMI(double waga, double wzrost) {

            double bMI = waga / (wzrost * wzrost);

            if (bMI < 18.5)
                System.out.println("Niedowaga: BMI < 18.5");
            else if (bMI <= 24.9)
                System.out.println("Norma: 18.5 <= BMI <= 24.9");
            else if (bMI <= 29.9)
                System.out.println("Nadwaga: 25 <= BMI <= 29.9");
            else if (bMI >= 30.0)
                System.out.println("Otyłość: BMI >= 30");


        }
    }
}
