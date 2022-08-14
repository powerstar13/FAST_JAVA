package ch15;

public class Person {

    private String personName;
    private int money;

    public Person(String personName, int money) {
        this.personName = personName;
        this.money = money;
    }

    public void takeTaxi(Taxi taxi, int pay)
    {
        taxi.take(pay);
        this.money -= pay;
    }

    public void showPersonInfo()
    {
        System.out.printf("%s님의 남은 돈은 %d원입니다.\n", personName, money);
    }
}
