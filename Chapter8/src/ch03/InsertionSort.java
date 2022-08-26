package ch03;

public class InsertionSort {

    public static void insertionSort(int[] arr, int count) {

        for(int i = 1; i < count; i++) {

            int temp = arr[i]; // 정렬할 값
            int j = i;

            while((j > 0) && temp < arr[j - 1]) { // 정렬할 값이 더 작은 경우

                arr[j] = arr[j - 1]; // 비교한 값을 하나 오른쪽으로 조정
                j -= 1;
            }

            arr[j] = temp; // 정렬된 값을 위치시킨다.

            System.out.println("반복 " + i);
            printSort(arr, count);
        }

    }

    public static void printSort(int value[], int count)
    {
        for(int i = 0; i < count; i++) {
            System.out.print(value[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = { 80, 50, 70, 10, 60, 20, 40, 30 };

        insertionSort(arr, arr.length);
    }

}

