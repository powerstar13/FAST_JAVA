package ch13;

import java.util.Scanner;

public class ConditionTest {

    public static void main(String[] args) {

        int max;
        System.out.println("두 수를 입력 받아서 더 큰 수를 출력하세요\n");

        Scanner scanner = new Scanner(System.in); // System.in이란? 표준 입력을 말한다. System.out은 표준 출력이다.

        System.out.println("입력 1:");
        int num1 = scanner.nextInt(); // 사용자의 입력을 받을 수 있다.
        System.out.println("입력 2:");
        int num2 = scanner.nextInt();

        max = (num1 > num2) ? num1 : num2; // 조건이 맞다면 앞의 값을 아니라면 뒤의 값을 반영한다.
        System.out.println(max);
    }
}
