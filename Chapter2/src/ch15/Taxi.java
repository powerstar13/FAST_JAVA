package ch15;

public class Taxi {

    private String companyName;
    private int money;

    public Taxi(String companyName) {
        this.companyName = companyName;
    }

    public void take(int pay)
    {
        this.money += pay;
    }

    public void showTaxiInfo()
    {
        System.out.printf("%s택시 수입은 %d원입니다.\n", companyName, money);
    }
}
