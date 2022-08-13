package ch19;

public class ForTest {

    public static void main(String[] args) {

        int count = 1; // i 변수 옆에 같이 초기화할 수 잇지만, for문 안에 함께 둘 경우 가독성이 떨어 질 수 있으므로 분리하여 작성하는 것이 좋다.
        int sum = 0;

        // 1부터 10까지의 합
        for (int i = 0; i < 10; i++, count++) { // 10번 반복
            sum += count;
        }

        System.out.println(sum);

        int num = 1;
        int total = 0;

        while (num <= 10) {
//            total += num++; // 연산을 한 줄에 표현해도 되지만 가독성을 위해 분리하는 것도 좋다.
            total += num;
            num++;
        }

        System.out.println(total);
    }
}
