package ch03;

public class CustomerTest {

    public static void main(String[] args) {

        VIPCustomer customerKim = new VIPCustomer();
        customerKim.setCustomerName("김유신");
        customerKim.setCustomerId(10020);
        customerKim.setBonusPoint(10000);
        System.out.println(customerKim.showCustomerInfo());

        VIPCustomer customerLee = new VIPCustomer(10020, "이순신");
        customerLee.setBonusPoint(10000);
        System.out.println(customerLee.showCustomerInfo());
    }
}
