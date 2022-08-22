package ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest4 {

    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("Chapter6/src/ch14/input2.txt")) {
            int i;
            byte[] bs = new byte[10]; // 10 바이트씩 읽을 것이다.

            // read() 메서드에 off과 len을 숫자로 직접 기입하는 경우는 없지만, 이렇게도 사용할 수 있다.
            while ((i = fis.read(bs, 1, 9)) != -1) {
                // 읽어온 바이트 개수 만큼만 출력하도록 처리
                for (int j = 0; j < i; j++) {
                    System.out.print((char) bs[j]);
                }
                System.out.println(" : " + i + "바이트 읽음");
            }
        }
        catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("end");
    }
}
