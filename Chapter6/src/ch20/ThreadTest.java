package ch20;

// Thread를 상속받는 방식
class MyThread extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 200; i++) {
            System.out.print(i + "\t");
        }
    }
}

public class ThreadTest {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread() + " >>> start"); // main Thread
        MyThread th1 = new MyThread();
        MyThread th2 = new MyThread();

        th1.start();
        th2.start();
        System.out.println(Thread.currentThread() + " >>> end"); // main Thread
    }
}
