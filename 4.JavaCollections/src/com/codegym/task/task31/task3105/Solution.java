package com.codegym.task.task31.task3105;
//TO ZADANIE JEST SPIEPRZONE OD PODSTAW W CODE GYM
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* 
Adding a file to an archive

*/
public class Solution {
    public static void main(String[] args) throws IOException {

       // String path1  = args[0];
       // String path2  = args[1];
        String path1 = "C:\\Users\\Bogus\\Desktop\\result.mp3";
        String path2 = "C:\\Users\\Bogus\\Desktop\\testy\\test.zip";

        FileInputStream fileInputStream = new FileInputStream(path2);
        ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);

        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(path2));
        Map<String, byte[]> map = saveFilesInMap(zipInputStream);
        addByteArraysToArchive(map,zipOutputStream);
        Files.copy(Paths.get(path1),zipOutputStream);

        fileInputStream.close();
       zipInputStream.close();
       zipOutputStream.close();




    }


    public static Map<String, byte[]> saveFilesInMap(ZipInputStream zipInputStream) {
        Map<String, byte[]> archiveContents = new HashMap<>();
        ZipEntry ze;
        try {
            while ((ze = zipInputStream.getNextEntry()) != null) {
                int len;
                byte[] buffer = new byte[1024];
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                while ((len = zipInputStream.read(buffer)) > 0) {
                    baos.write(buffer, 0, len);
                }
                archiveContents.put(ze.getName(), baos.toByteArray());
                baos.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return archiveContents;
    }


    public static void addByteArraysToArchive(Map<String, byte[]> byteArrays, ZipOutputStream zipOutputStream) {
        for (Map.Entry<String, byte[]> entry : byteArrays.entrySet()) {
            String name = entry.getKey();
            byte[] bytes = entry.getValue();
            try {
                ZipEntry zipEntry = new ZipEntry(name);
                zipEntry.setSize(bytes.length);
                zipOutputStream.putNextEntry(zipEntry);
                zipOutputStream.write(bytes);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void addFileToArchive(String fileToBeAdded, ZipOutputStream zipOutputStream) {
        try {
            zipOutputStream.putNextEntry(new ZipEntry("new/" + Paths.get(fileToBeAdded).getFileName()));
            Files.copy(Paths.get(fileToBeAdded), zipOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
