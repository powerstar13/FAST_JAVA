package ch06;

public class VariableTest {

    public static void main(String[] args) {

        byte minOfBnum = -128;
        byte maxOfBnum = 127;
        System.out.println(minOfBnum);
        System.out.println(maxOfBnum);

        int num = 123456789;
        long lnum = 12345678900L; // 소문자 l을 써도 되지만 숫자 1하고 헷갈릴 수 있으므로 대문자 L을 쓰는 것을 추천
        long numToLnum = 123456789; // 4바이트의 작은 숫자는 8바이트의 큰 그릇에 넣을 수 있다.
        System.out.println(num);
        System.out.println(lnum);
        System.out.println(numToLnum);
    }
}
