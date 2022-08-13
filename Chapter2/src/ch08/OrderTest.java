package ch08;

import java.time.LocalDateTime;

public class OrderTest {

    public static void main(String[] args) {

        Order order = new Order(
            "202011020003",
            "01023450001",
            "서울시 강남구 역삼동 111-333",
            35000,
            "0003",
            LocalDateTime.of(2020, 11, 2, 13, 2, 58)
        );

        System.out.println(order.getOrderInfo());
    }
}
