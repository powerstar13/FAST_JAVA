package ch21;

public class ContinueTest {

    public static void main(String[] args) {

        for (int num = 1; num <= 100; num++) {

            // 나머지 연산자를 이용하여 3의 배수인지 확인
            if ((num % 3) != 0) continue;
            System.out.println(num);
        }
    }
}
