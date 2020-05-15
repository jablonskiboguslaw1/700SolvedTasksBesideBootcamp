package com.codegym.task.task18.task1813;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream

*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";

private FileOutputStream stream;
    public AmigoOutputStream(FileOutputStream fileOutputStream) throws FileNotFoundException {
        super(fileName);
        this.stream=fileOutputStream;

    }

    @Override
    public void write(int b) throws IOException {
        stream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
      stream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        stream.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        stream.flush();
        stream.write(("CodeGym © All rights reserved.").getBytes());
        stream.close();
    }

    @Override
    public void flush() throws IOException {
        stream.flush();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
