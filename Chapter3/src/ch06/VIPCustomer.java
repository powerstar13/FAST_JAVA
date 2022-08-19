package ch06;

public class VIPCustomer extends Customer {

    private double salesRatio;
    private String agentId;

    public VIPCustomer(int customerId, String customerName) {
        // super 키워드를 이용하여 상위 클래스의 생성자 명시적으로 호출
        super(customerId, customerName);

        super.bonusRatio = 0.05;
        super.customerGrade = "VIP";
        this.salesRatio = 0.1;
    }

    public String getAgentId() {
        return agentId;
    }

    @Override
    public int calcPrice(int price) {

        super.bonusPoint += price * super.bonusRatio;
        return price - (int) (price * this.salesRatio);
    }
}
