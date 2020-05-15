package pl.codegym.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Relacje między kotami
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String imieDziadka = reader.readLine();
        Kot kotDziadek = new Kot(imieDziadka);

        String imieBabci = reader.readLine();
        Kot kotBabcia = new Kot(imieBabci);

        String imieOjca = reader.readLine();
        Kot kotOjciec = new Kot(kotDziadek,imieOjca);

        String imieMatki = reader.readLine();
        Kot kotMatka = new Kot(imieMatki,kotBabcia);

        String imieSyna = reader.readLine();
        Kot kotSyn = new Kot(imieSyna,kotOjciec, kotMatka);

        String imieCorki = reader.readLine();
        Kot kotCorka = new Kot(imieCorki,kotOjciec, kotMatka);

        System.out.println(kotDziadek);
        System.out.println(kotBabcia);
        System.out.println(kotOjciec);
        System.out.println(kotMatka);
        System.out.println(kotSyn);
        System.out.println(kotCorka);
    }

    public static class Kot {
        private String imie;
        private Kot ojciec;
        private Kot matka;

        Kot(String imie) {
            this.imie = imie;
        }

        Kot(String imie, Kot matka) {
            this.imie = imie;
            this.matka = matka;
        }

        Kot(Kot ojciec, String imie) {
            this.imie = imie;
            this.ojciec = ojciec;
        }

        Kot(String imie, Kot ojciec, Kot matka) {
            this.imie = imie;
            this.ojciec = ojciec;
            this.matka = matka;

        }

        @Override
        public String toString() {
            if ((ojciec== null)&&(matka == null))
                return "Imię kota to " + imie + ", brak matki, brak ojca ";
            else if (ojciec==null)
                return "Imię kota to " + imie + ", " + matka.imie +" to matka, brak ojca ";
            else if(matka ==null)
                return "Imię kota to " + imie + ", brak matki, "+ ojciec.imie + " to ojciec";
            else
                return "Imię kota to " + imie + ", "+  matka.imie+" to matka, " + ojciec.imie + " to ojciec, " ;

        }
    }
}
