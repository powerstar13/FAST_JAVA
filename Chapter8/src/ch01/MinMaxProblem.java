package ch01;

public class MinMaxProblem {

    public static void main(String[] args) {

        int[] numbers = { 10, 55, 23, 2, 79, 101, 16, 82, 30, 45 };

        // 1. 배열의 첫 번째 요소를 최솟값 최댓값으로 초기화하고 시작한다.
        int min = numbers[0];
        int max = numbers[0];

        int minPos = 0;
        int maxPos = 0;

        // 2. 배열을 한 번만 수행하여 최솟값과 최댓값을 구한다.
        for (int i = 1; i < numbers.length; i++) {

            // 최솟값인지 확인
            if (numbers[i] < min ) {
                min = numbers[i];
                minPos = i + 1;
            }

            // 최댓값인지 확인
            if (max < numbers[i]) {
                max = numbers[i];
                maxPos = i + 1;
            }
        }

        System.out.printf("가장 큰 값은 %d이고, 위치는 %d번째 입니다.\n", max, maxPos);
        System.out.printf("가장 작은 값은 %d이고, 위치는 %d번째 입니다.\n", min, minPos);
    }
}
