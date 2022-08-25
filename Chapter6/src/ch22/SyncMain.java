package ch22;

class Bank {

    private int money = 10000;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    /**
     * critical section
     * synchronized 키워드가 붙은 메서드의 객체(Bank)는 이 메서드가 수행되는 동안 Lock 상태가 된다.
     */
    public void saveMoney(int save) {

        // 메서드 구현부 안에서 synchronized를 사용할 경우 매개 변수에 넣은 객체를 Lock을 한다는 의미이다.
        // 지금은 this를 넣어서 Bank를 Lock 했지만 다른 객체를 넣어서 이 메서드가 수행되는 동안 Lock을 걸 수도 있다.
        synchronized (this) {

            int m = getMoney();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            setMoney(m + save);
        }

    }

    /**
     * critical section
     * synchronized 키워드가 붙은 메서드의 객체(Bank)는 이 메서드가 수행되는 동안 Lock 상태가 된다.
     */
    public synchronized void minusMoney(int minus) {

        int m = getMoney();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        setMoney(m - minus);
    }
}

class Park extends Thread {

    @Override
    public void run() {
        // Thread에 직접 동기화를 걸어줄 수도 있다. 이 때 공유 자원으로 어떤 객체인지 전달하면 된다.
//        synchronized (SyncMain.myBank) {
            System.out.println("start save");
            SyncMain.myBank.saveMoney(3000);
            System.out.println("saveMoney(3000): " + SyncMain.myBank.getMoney());
//        }
    }
}

class ParkWife extends Thread {

    @Override
    public void run() {
        System.out.println("start minus");
        SyncMain.myBank.minusMoney(1000);
        System.out.println("minusMoney(1000): " + SyncMain.myBank.getMoney());
    }
}

public class SyncMain {

    public static Bank myBank = new Bank(); // 공유 자원

    public static void main(String[] args) {

        Park p = new Park();
        p.start();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        ParkWife pw = new ParkWife();
        pw.start();
    }
}
