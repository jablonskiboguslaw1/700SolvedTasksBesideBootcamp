package com.codegym.task.task31.task3106;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/*
Unzipping a file

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        String resultFile = args[0];
        List<String> inFiles = new ArrayList<>();
        for (int i = 1; i < args.length; i++) {
            inFiles.add(args[i]);
        }
        Collections.sort(inFiles);

        List<FileInputStream> files = new ArrayList<>();
        for (String s: inFiles) {
            files.add(new FileInputStream(s));
        }

        OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(resultFile));
        ZipInputStream zipInputStream = new ZipInputStream(new SequenceInputStream(Collections.enumeration(files)));
        ZipEntry entry = zipInputStream.getNextEntry();
        //while ((entry = zipInputStream.getNextEntry()) != null) {
        byte[] buffer = new byte[1024];
        int readBytes = 0;
        while ((readBytes = zipInputStream.read(buffer)) > 0) {
            outputStream.write(buffer, 0, readBytes);
        }
        //}
        zipInputStream.close();
        outputStream.close();
    }
}


