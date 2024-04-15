package io.multipleReader;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsingBasicFiles {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/io/sample.txt");
        byte[] allBytes = Files.readAllBytes(path);
        System.out.println(new String(allBytes));
        }
}
