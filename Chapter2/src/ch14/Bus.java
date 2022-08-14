package ch14;

public class Bus {

    private int busNumber;
    private int passengerCount;
    private int money;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showBusInfo()
    {
        System.out.printf("%s번의 승객 수는 %d이고, 수입은 %d원입니다.\n", busNumber, passengerCount, money);
    }
}
