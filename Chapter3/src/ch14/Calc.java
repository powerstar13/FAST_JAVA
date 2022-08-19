package ch14;

public interface Calc {

    double PI = 3.14;
    int ERROR = -999999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    /**
     * default 메서드
     */
    default void description() {
        System.out.println("정수의 사칙연산을 제공합니다.");
        myMethod(); // privte 메서드 호출
    }

    /**
     * 정적 메서드
     * @param arr: 정수 배열
     * @return int: 모두 더한 값
     */
    static int total(int[] arr) {

        int total = 0;

        for (int num : arr) {
            total += num;
        }

        myStaticMethod(); // private 메서드 호출
        return total;
    }

    private void myMethod() {
        System.out.println("myMethod");
    }

    private static void myStaticMethod() {
        System.out.println("myStaticMethod");
    }
}
