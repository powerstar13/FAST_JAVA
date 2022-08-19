package ch04;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customerLee = new Customer(10010, "이순신");
        customerLee.setBonusPoint(10000);
        // 상위 클래스의 메서드가 호출됨
        int priceLee = customerLee.calcPrice(1000);
        System.out.println(customerLee.showCustomerInfo() + " 지불 금액은 " + priceLee + "원입니다.");

        VIPCustomer customerKim = new VIPCustomer(10020, "이순신");
        customerKim.setCustomerName("김유신");
        customerKim.setCustomerId(10020);
        customerKim.setBonusPoint(10000);
        // 하위 클래스에서 재정의한 메서드가 호출됨
        int priceKim = customerKim.calcPrice(1000);
        System.out.println(customerKim.showCustomerInfo() + " 지불 금액은 " + priceKim + "원입니다.");

        // 가상 메서드 방식
        Customer customerNo = new VIPCustomer(12345, "noname");
        customerKim.setBonusPoint(10000);
        // 하위 클래스의 가상 메서드가 호출됨
        int priceNo = customerNo.calcPrice(1000);
        System.out.println(customerNo.showCustomerInfo() + " 지불 금액은 " + priceNo + "원입니다.");
    }
}
