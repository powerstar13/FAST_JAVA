package ch18;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

    public static void main(String[] args) throws IOException {

        RandomAccessFile rf = new RandomAccessFile("Chapter6/src/ch18/random.txt", "rw");

        rf.writeInt(100);
        System.out.println("rf.getFilePointer() = " + rf.getFilePointer());
        rf.writeDouble(3.14);
        System.out.println("rf.getFilePointer() = " + rf.getFilePointer());
        rf.writeUTF("안녕하세요");
        System.out.println("rf.getFilePointer() = " + rf.getFilePointer());

        rf.seek(0); // 파일 포인터를 0(처음)으로 이동시킨다.

        int i = rf.readInt();
        double d = rf.readDouble();
        String str = rf.readUTF();

        System.out.println(i);
        System.out.println(d);
        System.out.println(str);
    }
}
