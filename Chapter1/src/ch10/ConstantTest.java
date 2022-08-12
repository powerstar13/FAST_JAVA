package ch10;

public class ConstantTest {

    public static void main(String[] args) {

        final int MAX_NUM = 100;
        final int MIN_NUM;

        MIN_NUM = 0; // 값을 지정 안하고는 사용할 수 없기 때문에 아래 출력문에서 사용하기 위해 값을 할당해야 한다.

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);

//        MAX_NUM = 1000; // 상수는 값을 재할당 할 수 없다.
    }
}
