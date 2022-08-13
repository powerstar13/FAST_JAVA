package ch16;

import java.util.Scanner;

public class SwitchCaseTest {

    public static void main(String[] args) {

        System.out.println("월 입력:");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        int day;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day = 31;
                break;
            case 2:
                day = 28;
                break;
            case 4: case 6: case 9: case 11:
                day = 30;
                break;
            default:
                System.out.println("존재하지 않는 달입니다.");
                day = -1;
        }

        System.out.printf("%s월은 %s일까지 존재합니다.%n", month, day);
    }
}
