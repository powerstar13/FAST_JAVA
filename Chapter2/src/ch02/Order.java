package ch02;

import java.time.LocalDateTime;

public class Order {

    String orderId; // 주문 식별키
    int orderNumber; // 주문 번호
    String buyerId; // 구매자 식별키
    String sellerId; // 판매자 식별키
    String productId; // 상품 식별키
    LocalDateTime orderDate; // 주문일
}
