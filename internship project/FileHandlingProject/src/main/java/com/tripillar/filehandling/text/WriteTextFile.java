package com.tripillar.filehandling.text;

import java.io.*;

public class WriteTextFile {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt"))) {
            bw.write("This is a test file.");
            bw.newLine();
            bw.write("Text file handling in Java.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

