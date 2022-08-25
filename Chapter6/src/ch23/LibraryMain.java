package ch23;

import java.util.ArrayList;

class FastLibrary {

    public ArrayList<String> shelf = new ArrayList<>();

    public FastLibrary() {
        shelf.add("태백산맥1");
        shelf.add("태백산맥2");
        shelf.add("태백산맥3");
    }

    public synchronized String lendBook() throws InterruptedException {

        Thread t = Thread.currentThread();

        while (shelf.isEmpty()) {
            System.out.printf("%s: waiting start\n", t.getName());
            wait();
            System.out.printf("%s: waiting end\n", t.getName());
        }

        if (!shelf.isEmpty()) {

            String book = shelf.remove(0);
            System.out.printf("%s: %s lend\n", t.getName(), book);
            return book;
        }
        else return null;
    }

    public synchronized void returnBook(String book) {

        Thread t = Thread.currentThread();

        shelf.add(book);
//        notify();
        notifyAll(); // notifyAll 을 권장
        System.out.printf("%s: %s return\n", t.getName(), book);
    }
}

class Student extends Thread {

    public Student(String name) {
        super(name);
    }

    @Override
    public void run() {

        try {
            String title = LibraryMain.library.lendBook();
            if (title == null) {
                System.out.println(getName() + ": 빌리지 못했음");
                return;
            }
            sleep(5000);
            LibraryMain.library.returnBook(title);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class LibraryMain {

    public static FastLibrary library = new FastLibrary();

    public static void main(String[] args) {

        Student std1 = new Student("std1");
        Student std2 = new Student("std2");
        Student std3 = new Student("std3");
        Student std4 = new Student("std4");
        Student std5 = new Student("std5");
        Student std6 = new Student("std6");

        std1.start();
        std2.start();
        std3.start();
        std4.start();
        std5.start();
        std6.start();
    }
}
