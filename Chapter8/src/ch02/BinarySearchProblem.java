package ch02;

public class BinarySearchProblem {

    public static void main(String[] args) {

        int[] numbers = { 12, 25, 31, 48, 54, 66, 70, 83, 95, 108 };

        int target = 83;
//        int target = 88;

        int left = 0; // 배열의 첫 번째로 초기화
        int right = numbers.length - 1; // 배열의 마지막으로 초기화
        int mid = (left + right) / 2; // 왼쪽과 오른쪽의 중간으로 초기화

        int temp = numbers[mid];
        boolean find = false; // 찾았는지 여부

        while (left <= right) {

            if (target == temp) { // 값을 찾았는지 확인
                find = true;
                break;
            }
            else if (target < temp) { // 찾으려는 값이 더 작다면
                right = mid - 1; // 오른쪽을 중간보다 하나 왼쪽으로 조정
            }
            else { // 찾으려는 값이 더 크다면
                left = mid + 1; // 왼쪽을 중간보다 하나 오른쪽으로 조정
            }

            mid = (left + right) / 2; // 중간 위치 조정
            temp = numbers[mid]; // 중간값 조정
        }

        if (find == true) {
            System.out.printf("찾는 수가 %d번째 있습니다.\n", mid + 1);
        } else {
            System.out.println("찾는 수가 없습니다.");
        }
    }
}
