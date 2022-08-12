package ch13;

public class BitOperationTest {

    public static void main(String[] args) {

        int num1 = 5; // 00000101
        int num2 = 10; // 00001010

        //   00000101
        // | 00001010
        // ---------- 1&1은 1 반환 그 외는 0
        // = 00001111 --> 15
        System.out.println(num1 | num2);
        //   00000101
        // & 00001010
        // ---------- 0|0은 0 반환 그 외는 0
        // = 00000000 --> 0
        System.out.println(num1 & num2);
        //   00000101
        // ^ 00001010
        // ---------- 두 개의 비트가 서로 다른 경우에 1을 반환
        // = 00001111 --> 15
        System.out.println(num1 ^ num2);
        // ~ 00000101
        // ---------- 비트의 반전
        // = 11111010 --> -6
        System.out.println(~num1);

        // 00000101 << 1
        // 왼쪽으로 1칸씩 이동하고, 제일 앞은 Truncate
        // 00001010 --> 10

        // 00000101 << 2
        // 왼쪽으로 2칸씩 이동하고, 제일 앞은 Truncate
        // 00010100 --> 20
        System.out.println(num1 << 2);
        System.out.println(num1);
        // 복합 대입 연산자를 통해 변수의 값을 바꿀 수 있다.
        System.out.println(num1 <<= 2);
        System.out.println(num1);

        // 00010100 >> 1
        // 오른쪽으로 1칸씩 이동하고, 제일 뒤는 Truncate
        // 00001010 --> 10
        System.out.println(num1 >> 1);
    }
}
