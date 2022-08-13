package ch08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Order {

    private String orderNumber; // 주문 접수 번호
    private String phone; // 주문 핸드폰 번호
    private String address; // 주문 집 주소
    private int price; // 주문 가격
    private String menuId; // 메뉴 번호
    private LocalDateTime createdAt; // 생성일

    public Order(String orderNumber, String phone, String address, int price, String menuId, LocalDateTime createdAt) {
        this.orderNumber = orderNumber;
        this.phone = phone;
        this.address = address;
        this.price = price;
        this.menuId = menuId;
        this.createdAt = createdAt;
    }

    public String getOrderInfo() {
        return String.format(
            """
                주문 접수 번호: %s
                주문 핸드폰 번호: %s
                주문 집 주소: %s
                주문 날짜: %s
                주문 시간: %s
                주문 가격: %d
                메뉴 번호: %s""",
            orderNumber,
            phone,
            address,
            createdAt.format(DateTimeFormatter.ofPattern("yyyyMMdd", Locale.KOREA)),
            createdAt.format(DateTimeFormatter.ofPattern("HHmmss", Locale.KOREA)),
            price,
            menuId
        );
    }
}
