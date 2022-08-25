package ch17;

import java.io.*;

class Person2 implements Externalizable {

    private String name;
    private String job;

    public Person2() {
    }

    public Person2(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return name + ", " + job;
    }

    @Override
    public void writeExternal(ObjectOutput obj) throws IOException {
        obj.writeUTF(name);
//        obj.writeUTF(job);
    }

    @Override
    public void readExternal(ObjectInput obj) throws IOException, ClassNotFoundException {
        name = obj.readUTF();
//        job = obj.readUTF();
    }
}

public class ExternalizableTest {

    public static void main(String[] args) {


        Person2 personLee = new Person2("이순신", "대표이사");
        Person2 personKim = new Person2("김유신", "상무이사");

        try (FileOutputStream fos = new FileOutputStream("Chapter6/src/ch17/serial.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {
            oos.writeObject(personLee);
            oos.writeObject(personKim);
        }
        catch (IOException e) {
            System.out.println(e);
        }

        try (FileInputStream fis = new FileInputStream("Chapter6/src/ch17/serial.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            Person2 pLee = (Person2) ois.readObject();
            Person2 pKim = (Person2) ois.readObject();

            System.out.println(pLee.toString());
            System.out.println(pKim.toString());
        }
        catch (IOException e) {
            System.out.println(e);
        }
        catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
