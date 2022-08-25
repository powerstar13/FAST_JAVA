package ch21;

public class JoinTest extends Thread {

    private int start;
    private int end;
    private int total;

    public JoinTest(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {

        for (int i = start; i <= end; i++) {

            total += i;
        }
    }

    public static void main(String[] args) {

        JoinTest jt1 = new JoinTest(1, 50);
        JoinTest jt2 = new JoinTest(51, 100);

        jt1.start();
        jt2.start();

        try {
            // join이 모두 끝날 때까지 main Thread가 non-runnable 상태에 빠진다.
            jt1.join();
            jt2.join();
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }

        int lastTotal = jt1.total + jt2.total;

        System.out.println("jt1.total = " + jt1.total);
        System.out.println("jt2.total = " + jt2.total);

        System.out.println("lastTotal = " + lastTotal);
    }
}
