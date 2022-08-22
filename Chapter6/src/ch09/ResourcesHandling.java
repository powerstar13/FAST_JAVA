package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ResourcesHandling {

    public static void main(String[] args) {

        // FileInputStream의 경우에는 AutoCloseable을 구현하고 있음
        try (FileInputStream fis = new FileInputStream("a.txt")) {
            System.out.println("read");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) { // close() 메서드로 인해 예외 처리 catch
            System.out.println(e);
        }
        System.out.println("end");
    }
}
