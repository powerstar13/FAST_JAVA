package ch06;

public class GoldCustomer extends Customer {

    private double salesRatio;

    public GoldCustomer(int customerId, String customerName) {
        super(customerId, customerName);

        this.salesRatio = 0.1;
        super.bonusRatio = 0.02;
        super.customerGrade = "GOLD";
    }

    @Override
    public int calcPrice(int price) {

        super.bonusPoint += price * super.bonusRatio;
        return price - (int) (price * this.salesRatio);
    }
}
