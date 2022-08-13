package ch17;

public class WhileTest {

    public static void main(String[] args) {

        int num = 1;
        int sum = 0; // 지역 변수는 초기화 하는 것에 신경 써야 한다.

        while (num <= 10) {
            sum += num++;
        }
        System.out.println(sum);
        System.out.println(num);
    }
}
