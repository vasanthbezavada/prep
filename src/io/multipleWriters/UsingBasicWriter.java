package io.multipleWriters;

import java.io.FileWriter;
import java.io.IOException;

public class UsingBasicWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("src/io/newcreatedFile.txt");
        String data = "everu sir "+ "\n" + "meeru ?";
        fileWriter.write(data);
        fileWriter.close();
    }
}
