package ch16;

import java.io.*;

public class DataStreamTest {

    public static void main(String[] args) {

        try(
            FileOutputStream fos = new FileOutputStream("Chapter6/src/ch16/data.txt");
            DataOutputStream dos = new DataOutputStream(fos)
        ) {
            dos.writeByte(100);
            dos.writeChar('A');
            dos.writeInt(10);
            dos.writeFloat(3.14f);
            dos.writeUTF("Test");
        }
        catch(IOException e) {
            System.out.println(e);
        }

        try(
            FileInputStream fis = new FileInputStream("Chapter6/src/ch16/data.txt");
            DataInputStream dis = new DataInputStream(fis)
        ) {
            System.out.println(dis.readByte());
            System.out.println(dis.readChar());
            System.out.println(dis.readInt());
            System.out.println(dis.readFloat());
            System.out.println(dis.readUTF());
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
