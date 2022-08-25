package ch20;

// Runnable를 구현하는 방식
class RunnableMyThread implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 200; i++) {
            System.out.print(i + "\t");
        }
    }
}

public class ThreadTest2 {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread() + " >>> start"); // main Thread
        RunnableMyThread runnable = new RunnableMyThread();

        // Thread 생성자에 Runnable 구현체를 전달하는 방식
        Thread th1 = new Thread(runnable);
        Thread th2 = new Thread(runnable);

        th1.start();
        th2.start();
        System.out.println(Thread.currentThread() + " >>> end"); // main Thread

        // 간단 버전(익명 내부 클래스)
        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("run");
            }
        };
        run.run();
    }
}
