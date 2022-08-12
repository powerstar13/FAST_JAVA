package ch10;

public class TypeConversionTest {

    public static void main(String[] args) {

        byte bNum1 = 125;
        int iNum1 = bNum1;
        System.out.println(iNum1);

        int iNum2 = 255;
        byte bNum2 = (byte) iNum2; // 바이크 크기가 작은 곳에 바이크 큰 것을 담으려 하면 이상한 값으로 나온다. (예: -1)
        System.out.println(bNum2);

        double dNum3 = 3.14;
        int iNum3 = (int) dNum3; // 더 정밀한 수가 덜 정밀한 수로 들어가려고 할 경우 자료가 유실된다. (예: 3)
        System.out.println(iNum3);

        double dNum4 = 1.2;
        float fNum4 = 0.9F;

        // 먼저 형 변환을 할 경우 결과가 다를 수 있다.
        int iNum4_1 = (int) dNum4 + (int) fNum4; // 1 + 0 = 1, 자료으 유실
        int iNum4_2 = (int) (dNum4 + fNum4); // 2, 자료의 유실

        System.out.println(iNum4_1);
        System.out.println(iNum4_2);
    }
}
