package ch20;

public class NestedLoopTest {

    public static void main(String[] args) {

        int dan;
        int count;

        // for문 사용
        for (dan = 2; dan <= 9; dan++) {

            for (count = 1; count <= 9; count++) {
                System.out.printf("%d X %d = %d\n", dan, count, dan * count);
            }
            System.out.println();
        }

        // while문 사용
        dan = 2;
        while (dan <= 9) {
            count = 1;
            while (count <= 9) {
                System.out.printf("%d X %d = %d\n", dan, count, dan * count);
                count++;
            }
            dan++;
            System.out.println();
        }
    }
}
