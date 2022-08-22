package ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest1 {

    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("Chapter6/src/ch14/input.txt")) {
            System.out.println((char) fis.read());
            System.out.println((char) fis.read());
            System.out.println((char) fis.read());
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("end");
    }
}
