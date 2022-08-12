package ch12;

public class ShortCircuit {

    public static void main(String[] args) {

        int num1 = 10;
        int i = 2;

        boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10); // 논리 곱의 경우 앞의 연산에서 false가 발생함으로 뒤의 연산을 확인하지 않는다.
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);

        value = ((num1 = num1 + 10) < 10) || ((i = i + 2) < 10); // 논리 합의 경우 뒤의 연산까지 확인해야 한다.
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);
    }
}
