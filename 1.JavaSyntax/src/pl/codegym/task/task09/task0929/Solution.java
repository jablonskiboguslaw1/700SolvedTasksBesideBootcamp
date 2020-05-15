package pl.codegym.task.task09.task0929;


import java.io.*;

/*
Sprawmy, by kod robił coś pożytecznego!
*//*


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String plikZrodlowyNazwa = reader.readLine();
        String plikDocelowyNazwa = reader.readLine();

        InputStream plikStrumienWejsciowy = getInputStream(plikZrodlowyNazwa);
        OutputStream plikStrumienWyjsciowy = getOutputStream(plikDocelowyNazwa);

        while (plikStrumienWejsciowy.available() > 0) {
            int dane = fileInputStream.read();
            fileOutputStream.write(dane);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String nazwaPliku) throws IOException {
        return new FileInputStream(nazwaPliku);
    }

    public static OutputStream getOutputStream(String nazwaPliku) throws IOException {
        return new FileOutputStream(nazwaPliku);
    }
}

*/
