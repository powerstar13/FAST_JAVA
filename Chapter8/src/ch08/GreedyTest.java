package ch08;

public class GreedyTest {

    public static void main(String[] args) {

        int[] coins = { 500, 100, 50, 10 }; // 동전 종류
        int price = 8370;
        int count;

        for (int i = 0; i < coins.length; i++) {

            count = 0; // 0회로 초기화

            count += price / coins[i]; // 낼 수 있는 만큼 카운팅
            price = price % coins[i]; // 나머지

            System.out.println(coins[i] + "짜리 동전 " + count + "개가 필요합니다.");
        }
    }
}
