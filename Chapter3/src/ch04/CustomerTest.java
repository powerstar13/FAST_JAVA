package ch04;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customerLee = new Customer(10010, "이순신");
        customerLee.setBonusPoint(10000);
        int price = customerLee.calcPrice(1000);
        System.out.println(customerLee.showCustomerInfo() + price);

        VIPCustomer customerKim = new VIPCustomer(10020, "이순신");
        customerKim.setCustomerName("김유신");
        customerKim.setCustomerId(10020);
        customerKim.setBonusPoint(10000);
        price = customerKim.calcPrice(1000);
        System.out.println(customerKim.showCustomerInfo() + price);
    }
}
