package ch02;

public class VIPCustomer extends Customer {

    private double salesRatio;
    private String agentId;

    public VIPCustomer() {
        super.bonusRatio = 0.05;
        super.customerGrade = "VIP";
        this.salesRatio = 0.1;
    }

    public String getAgentId() {
        return agentId;
    }
}
