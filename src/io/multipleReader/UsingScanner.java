package io.multipleReader;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class UsingScanner {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(Paths.get("src/io/sample.txt"));
        while (sc.hasNext()){
            System.out.println(sc.nextLine());
        }
    }
}
