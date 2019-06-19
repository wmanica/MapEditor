package gfx;

import java.io.*;
import java.lang.*;

public class SaveLoad {

    private Grid grid;
    private String toWrite = Grid.printString();

    public static void writeToFile(String toWrite) {
        try {
            FileWriter stringWriter = new FileWriter("save2load.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(stringWriter);
            bufferedWriter.write(toWrite);
            bufferedWriter.close();
        } catch (IOException ioEx) {
            System.out.println("IO Exception");
        }
    }
}
