package com.codegym.task.task32.task3211;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.security.MessageDigest;

/* 
Data integrity

*/

public class Solution {
    public static void main(String... args) throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(new String("test string"));
        oos.flush();
        System.out.println(compareMD5(bos, "5a47d12a2e3f9fecf2d9ba1fd98152eb")); // true

    }

    public static boolean compareMD5(ByteArrayOutputStream byteArrayOutputStream, String md5) throws Exception {
MessageDigest md = MessageDigest.getInstance("MD5");
md.update(byteArrayOutputStream.toByteArray());
        byte[] digest = md.digest();
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b: digest){
            String temp = (Integer.toHexString(0xFF & b));
            if(temp.length()==1){
                stringBuffer.append('0');

            }stringBuffer.append(temp);

        }
        String hash = stringBuffer.toString();

      return md5.equals(hash);

    }
}
