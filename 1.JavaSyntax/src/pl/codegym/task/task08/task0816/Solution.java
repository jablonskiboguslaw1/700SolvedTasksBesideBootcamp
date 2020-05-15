package pl.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/* 
Miła Emma i letnie wakacje
*/

public class Solution {
    public static HashMap<String, Date> utworzMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.forLanguageTag("pl"));
        HashMap<String, Date> mapa = new HashMap<String, Date>();
        mapa.put("Stallone", df.parse("CZERWIEC 1 1980"));
        mapa.put("kowalski", df.parse("KWIECIEŃ 16 1980"));
        mapa.put("Seamen", df.parse("LUTY 28 1980"));
        mapa.put("krol", df.parse("CZERWIEC 1 1980"));
        mapa.put("Stall", df.parse("LIPIEC 22 1980"));
        mapa.put("one", df.parse("CZERWIEC 1 1980"));
        mapa.put("Staone", df.parse("CZERWIEC 3 1980"));
        mapa.put("Sllone", df.parse("GRUDZIEŃ 4 1980"));
        mapa.put("Stalle", df.parse("MARZEC 2 1980"));
        mapa.put("Stlloe", df.parse("SIERPIEŃ 7 1980"));

        return mapa;//tutaj wpisz swój kod
    }

    public static void usunUrodzonychLatem(HashMap<String, Date> mapa) {
        mapa.entrySet().removeIf(next -> next.getValue().getMonth() == Calendar.JUNE);
        mapa.entrySet().removeIf(next -> next.getValue().getMonth() == Calendar.AUGUST);
        mapa.entrySet().removeIf(next -> next.getValue().getMonth() == Calendar.JULY);

               ; //tutaj wpisz swój kod

    }

    public static void main(String[] args) {

    }
}
