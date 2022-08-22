package ch05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        for (int num : arr) {
            System.out.println(num);
        }

        System.out.println();

        IntStream is = Arrays.stream(arr);
        is.forEach(System.out::println);
//        is.forEach(); // ERROR!!! 한 번 소모된 스트림은 재사용 불가

        int sum = Arrays.stream(arr).sum(); // 새로 Stream을 생성하여 사용
        System.out.println(sum);
    }
}
