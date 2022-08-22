package ch16;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

    public static void main(String[] args) {

        // InputStreamReader 보조 스트림은 FileInputStream을 감싸서 문자를 읽을 수 있게 한다.
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream("Chapter6/src/ch16/reader.txt"))) {

            int i;

            while ((i = isr.read()) != -1) {
                System.out.print((char) i);
            }
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
