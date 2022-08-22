package ch07;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TravelCustomerTest {

    public static void main(String[] args) {

        TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
        TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
        TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);

        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerHong);

        System.out.println("===== 고객 명단 출력 =====");
        customerList.stream()
            .map(travelCustomer -> travelCustomer.getName()) // 이름만 추출
            .forEach(travelCustomer -> System.out.println(travelCustomer));

        System.out.println("===== 여행 비용 =====");
        System.out.println(
            customerList.stream()
                .mapToInt(value -> value.getPrice())
                .sum()
        );

        System.out.println("===== 20세 이상 고객 이름 정렬 =====");
        customerList.stream()
            .filter(travelCustomer -> travelCustomer.getAge() >= 20)
            .map(travelCustomer -> travelCustomer.getName())
            .sorted()
            .forEach(s -> System.out.println(s));
    }
}
