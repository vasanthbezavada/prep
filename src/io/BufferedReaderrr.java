package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderrr {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int data = bf.read(); // reads only first char and converts into int
        String dataa = bf.readLine();// reads whole line , but parse it latter
        System.out.println(data);

        // buffered reader is used to read files as well

        BufferedReader fileReader = new BufferedReader(new FileReader("src/io/sample.txt"));
        String line = fileReader.readLine();
        while (line!=null){
            System.out.println(line);
            line = fileReader.readLine();
        }

    }
}
