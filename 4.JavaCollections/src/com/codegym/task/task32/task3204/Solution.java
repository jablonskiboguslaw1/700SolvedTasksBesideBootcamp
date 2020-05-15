package com.codegym.task.task32.task3204;

import javax.xml.stream.events.Characters;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;

/* 
Password generator

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
        /*StringBuilder stringBuilder = new StringBuilder();
        do {
            for (int i = 0; i < 8; i++) {
                if (chanceRandom() == 7) {
                    stringBuilder.append(getNumber());
                } else stringBuilder.append(getLatin());}
            }
            while ((!stringBuilder.toString().matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}$"))&& stringBuilder.toString().length()==8) ;

            System.out.println(stringBuilder.toString());
        }
*/

    }


    public static ByteArrayOutputStream getPassword() throws IOException {
        ByteArrayOutputStream passwordStream = new ByteArrayOutputStream();
        StringBuilder stringBuilder = new StringBuilder();
        do {
            stringBuilder.setLength(0);
            for (int i = 0; i < 8; i++) {
                if (chanceRandom() == 0) {
                    stringBuilder.append(getNumber());
                } else stringBuilder.append(getLatin());}
        }
        while (((!stringBuilder.toString().matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?!=.*[@$!%*?&]).{8}$")))) ;




        String s = stringBuilder.toString();
        byte[] bytes = s.getBytes();
        passwordStream.write(bytes);


       return passwordStream;
    }

    public static char getNumber() {
        Random random = new Random();
        return (char) (random.nextInt(10) + 48);

        // a>48&&a<57
    }

    public static char getLatin() {
        Random random = new Random();
        char latinSmall = ((char) (random.nextInt(25) + 65));
        char output;
        if (random.nextBoolean()) {
            output = Character.toLowerCase(latinSmall);
            return output;
        } else return latinSmall;
    }

    public static int chanceRandom() {
        Random random = new Random();
        return random.nextInt(7);
    }
    }

