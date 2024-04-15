package io.multipleReader;

import java.io.*;

public class UsingBufferedReaders {
    public static void main(String[] args) throws IOException {
        String fileName = "src/io/sample.txt";
        File file = new File(fileName);
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"UTF-8");
        BufferedReader bf = new BufferedReader(inputStreamReader);
        String line = bf.readLine();
        while (line!=null){
            System.out.println(line);
            line = bf.readLine();
        }
        bf.close();
    }
}
