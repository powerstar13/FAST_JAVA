package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

    public static void main(String[] args) {

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("a.txt");
            System.out.println("read");
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
//            return;
        }
        finally {
            if (fis != null) {
                try {
                    fis.close();
                    System.out.println("close");
                }
                catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            System.out.println("finally");
        }
        System.out.println("end");
    }
}
