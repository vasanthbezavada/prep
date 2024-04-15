package io.multipleReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UsingFileReaders {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader("src/io/sample.txt"));
        String line = fileReader.readLine();
        while (line != null) {
            System.out.println(line);
            line = fileReader.readLine();
        }
        fileReader.close();
    }
}
