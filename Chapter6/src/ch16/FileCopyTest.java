package ch16;

import java.io.*;
import java.net.Socket;

public class FileCopyTest {

    public static void main(String[] args) {

        long millisecond = 0;

        // Bufferd를 사용할 경우 굉장히 빠른 속도로 copy가 된다. (5MB 기준 30초 -> 0.1초)
        try (
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Chapter6/src/ch16/a.zip"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Chapter6/src/ch16/copy.zip"))
        ) {
            millisecond = System.currentTimeMillis();

            int i;
            while ((i = bis.read()) != -1) {
                bos.write(i);
            }

            // 바이트 단위로 옮기면 굉장히 오래 걸림
//        try (
//            FileInputStream fis = new FileInputStream("Chapter6/src/ch16/a.zip");
//            FileOutputStream fos = new FileOutputStream("Chapter6/src/ch16/copy.zip")
//        ) {
//            millisecond = System.currentTimeMillis();
//
//            int i;
//            while ((i = fis.read()) != -1) {
//                fos.write(i);
//            }

            millisecond = System.currentTimeMillis() - millisecond;
        }
        catch (IOException e) {
            System.out.println(e);
        }

        System.out.println(millisecond + " 소요되었습니다.");

        // 챗봇 기능을 사용한다고 할 때 한글을 굉장히 빠르게 읽어오는 방법은 아래와 같다.
        Socket socket = new Socket();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            br.readLine(); // new line 기능을 제공해주는 readLine
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
