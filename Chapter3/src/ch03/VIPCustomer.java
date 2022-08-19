package ch03;

public class VIPCustomer extends Customer {

    private double salesRatio;
    private String agentId;

    public VIPCustomer() {
        super.bonusRatio = 0.05;
        super.customerGrade = "VIP";
        this.salesRatio = 0.1;

        System.out.println("VIPCustomer() call");
    }

    public VIPCustomer(int customerId, String customerName) {
        // super 키워드를 이용하여 상위 클래스의 생성자 명시적으로 호출
        super(customerId, customerName);

        super.bonusRatio = 0.05;
        super.customerGrade = "VIP";
        this.salesRatio = 0.1;

        System.out.println("VIPCustomer(int, String) call");
    }

    public String getAgentId() {
        return agentId;
    }
}
