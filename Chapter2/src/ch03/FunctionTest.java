package ch03;

public class FunctionTest {

    /**
     * 더하기
     * @param num1: 더할 숫자 1
     * @param num2: 더할 숫자 2
     * @return int: 더한 결과
     */
    public static int addNum(int num1, int num2) {

        int result;
        result = num1 + num2;
        return result;
    }

    /**
     * 메시지 출력
     * @param greeting: 출력할 인사
     */
    public static void sayHello(String greeting) {
        System.out.println(greeting);
    }

    /**
     * 1부터 100까지 더하기 계산
     * @return int: 계산된 결과
     */
    public static int calcSum() {

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 20;

        int total = addNum(n1, n2);
        System.out.println(total);

        sayHello("안녕하세요");

        int num = calcSum();
        System.out.println(num);
    }
}
