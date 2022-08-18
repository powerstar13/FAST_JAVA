package ch22;

public class TwoDimensionTest {

    public static void main(String[] args) {

        int[][] arr = { { 1, 2, 3}, { 4, 5, 6, 7 } };

        // 행
        for (int i = 0; i < arr.length; i++) {
            // 열
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.printf(", \t%d\n", arr[i].length);
        }
    }
}
