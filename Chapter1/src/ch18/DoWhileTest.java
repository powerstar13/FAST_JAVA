package ch18;

import java.util.Scanner;

public class DoWhileTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input;
        int sum = 0;

        // while문의 표현
//        input = scanner.nextInt();
//        while (input != 0) {
//            sum += input;
//            System.out.println("값 입력:");
//            input = scanner.nextInt();
//        }

        // do-while문의 표현
        do {
            System.out.println("값 입력:");
            input = scanner.nextInt();
            sum += input;
        } while (input != 0);

        System.out.println(sum);
    }
}
