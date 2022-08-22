package ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {

    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("Chapter6/src/ch14/input.txt")) {
            int i;
            while ((i = fis.read()) != -1) { // read() 메서드는 int를 반환하며 더 이상 읽을 수 없는 경우 -1을 반환한다.
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println();
        System.out.println("end");
    }
}
