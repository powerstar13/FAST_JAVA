package ch15;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

    public static void main(String[] args) {

        try (FileReader fr = new FileReader("Chapter6/src/ch15/reader.txt")) {

            int i;

            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        }
        catch (IOException e) {
            System.out.println(e);
        }

        System.out.println();
        System.out.println("end");
    }
}
