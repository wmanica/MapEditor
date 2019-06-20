package gfx;

import java.io.*;
import java.lang.*;

public class FileManager {

    private static final String FILE = "resources/save2load.txt";

    public static void writeToFile(String toWrite) {
        try {
            FileWriter stringWriter = new FileWriter(FILE);
            BufferedWriter bufferedWriter = new BufferedWriter(stringWriter);
            bufferedWriter.write(toWrite);
            bufferedWriter.close();
        } catch (IOException ioEx) {
            System.out.println("IO Exception");
        }
    }


    public static String loadFile() {

        String toLoad = "";
        try {
            FileReader stringReader = new FileReader(FILE);
            BufferedReader bufferedReader = new BufferedReader(stringReader);

            String line = "";
            toLoad = "";

            while ((line = bufferedReader.readLine()) != null) {
                toLoad += line + "\n";
            }
            bufferedReader.close();

        } catch (IOException ioEx) {
            System.out.println("IO Exception");
        }

        return toLoad;
    }
}