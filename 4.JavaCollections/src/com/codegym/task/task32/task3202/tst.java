package com.codegym.task.task32.task3202;

import java.io.*;

public class tst {
    public static void main (String[] args) throws Exception
    {
        // The Reader must read this String.
        String test = "Hi!\n My name is Richard\n I'm a photographer\n";

        // Wrap the String in a StringReader.
        StringReader reader = new StringReader(test);

        // Create a StringWriter object.
        StringWriter writer = new StringWriter();

        // Copy strings from the Reader to the Writer, after first reversing them.
        executor(reader, writer);

        // Get the text that was written to the Writer.
        String result = writer.toString();

        // Display the text from the Writer on the screen.
        System.out.println("Result: "+ result);
    }

    public static void executor(Reader reader, Writer writer) throws Exception
    {
        BufferedReader br = new BufferedReader(reader);
        String line;

        // Read a string from the Reader.
        while ((line = br.readLine()) != null)
        {

            // Reverse the string.
            StringBuilder sb = new StringBuilder(line);
            String newLine = sb.reverse().toString();

            // Write the string to the Writer.
            writer.write(newLine);
        }
    }
}
