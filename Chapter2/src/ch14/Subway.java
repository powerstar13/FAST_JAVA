package ch14;

public class Subway {

    private int subwayNumber;
    private int passengerCount;
    private int money;

    public Subway(int subwayNumber) {
        this.subwayNumber = subwayNumber;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showBusInfo()
    {
        System.out.printf("%s번의 승객 수는 %d이고, 수입은 %d원입니다.\n", subwayNumber, passengerCount, money);
    }
}
