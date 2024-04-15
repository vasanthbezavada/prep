package io.anj;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class VariousWays {
    public static void main(String[] args) throws IOException {
///*        Scanner sc = new Scanner(System.in);
//        String data = sc.nextLine();
//        int intData = sc.nextInt();
//*/
//        ///////////////////////////////
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String data = bufferedReader.readLine();
//        char charData = bufferedReader.readLine().charAt(0);
//        System.out.println(data);
        String filePath = "src/io/sample.txt";
        readUsingFilesAndPaths(filePath);
        readUsingFileReader(filePath);
        readUsingBufferReader(filePath);
        readUsingScanner(filePath);

        /////// File writing.
        String writePath = "src/io/newFile";
        byte[] dataToWrite = {'a','\n','b','\n','e'};
        writeUsingFilesAndPaths(writePath,dataToWrite);
        writeUsingFileWriter(writePath,dataToWrite);
        writeusingBufferedWriter(writePath,dataToWrite);

    }

    private static void writeusingBufferedWriter(String writePath, byte[] dataToWrite) throws IOException {
        BufferedWriter br = new BufferedWriter(new FileWriter(new File(writePath)));
        br.write(new String(dataToWrite));
        br.close();
    }

    private static void writeUsingFileWriter(String writePath, byte[] dataToWrite) throws IOException {
        FileWriter fileWriter = new FileWriter(new File(writePath));
        fileWriter.write(new String(dataToWrite));
        fileWriter.write(new String(dataToWrite));
        fileWriter.close();
    }

    private static void writeUsingFilesAndPaths(String writePath, byte[] dataToWrite) throws IOException {
        Files.write(Paths.get(writePath),dataToWrite);
    }

    private static void readUsingScanner(String filePath) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filePath));
        while (sc.hasNext()){
            System.out.println(sc.nextLine());
        }
    }

    private static void readUsingBufferReader(String filePath) throws IOException {
        File file = new File(filePath);
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"UTF-8");
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line = bufferedReader.readLine();
        while (line!=null){
            System.out.println(line);
            line=bufferedReader.readLine();
        }
    }

    private static void readUsingFileReader(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();
        while (line!=null){
            System.out.println(line);
            line=bufferedReader.readLine();
        }
    }

    private static void readUsingFilesAndPaths(String filePath) throws IOException {
        byte[] data = Files.readAllBytes(Paths.get(filePath));
        System.out.println(new String(data));
    }


}
