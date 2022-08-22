package ch14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {

    public static void main(String[] args) throws FileNotFoundException {

        FileOutputStream fos = new FileOutputStream("Chapter6/src/ch14/output3.txt", true); // append 옵션을 true로 설정하여 이어쓰기 모드

        try (fos) { //java 9 부터 제공되는 기능: try() 안에 변수만 넣어도 된다.

            byte[] bs = new byte[26];

            byte data = 65;

            for (int i = 0; i < bs.length; i++) {
                bs[i] = data++;
            }

            fos.write(bs, 2, 10);
        }
        catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("end");
    }
}
