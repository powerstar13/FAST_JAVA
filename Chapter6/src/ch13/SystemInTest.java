package ch13;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest {

    public static void main(String[] args) {

        System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요.");

        int i;

        try {
            // 한글 입력의 경우 System.in을 그대로 사용하여 read() 할 경우 깨지기 때문에 InputStreamReader (보조 스트림)를 사용하여 한 번 감싸주어야 깨지지 않는다.
            InputStreamReader irs = new InputStreamReader(System.in);
            while ((i = irs.read()) != '\n') {
                System.out.print((char) i);
            }
            System.out.println();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
