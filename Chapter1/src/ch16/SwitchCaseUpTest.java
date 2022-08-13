package ch16;

import java.util.Scanner;

public class SwitchCaseUpTest {

    public static void main(String[] args) {

        System.out.println("월 입력:");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        // java 14부터 지원됨
        int day = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 ->
                31;
            case 2 ->
                28;
            case 4, 6, 9, 11 ->
                30;
            default -> {
                System.out.println("존재하지 않는 달입니다.");
                yield -1;
            }
        };

        System.out.printf("%s월은 %s일까지 존재합니다.%n", month, day);
    }
}
