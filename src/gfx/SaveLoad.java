package gfx;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.*;

public class SaveLoad {

    private Grid grid;

    public void writeToFile(String toWrite) {
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
