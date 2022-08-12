package ch07;

public class DoubleTest2 {

    public static void main(String[] args) {

        double dnum = 1;

        for (int i = 0; i < 10000; i++) {
            dnum += 0.1;
        }
        System.out.println(dnum); // 부동 소수점 방식의 오류를 볼 수 잇다.
        // 1001을 기대할 수 있지만, 1001.000000000159 로 값이 나오는 오차를 볼 수 있다.
    }
}
