package ch04;

public class BinaryTest {

    public static void main(String[] args) {

        int num = 10; // 10진수 10을 정수로 표현
        int bNum = 0B1010; // 0B: 2진수로 표현하겠다는 뜻이며, 뒤에 2진수 값을 작성한다. (소문자로 0b로 시작해도 된다.)
        int oNum = 012; // 0: 8진수로 표현하겠다는 뜻이며, 뒤에 8진수 값을 작성한다.
        int xNum = 0XA; // 0X: 16진수로 표현하겠다는 뜻이며, 뒤에 16진수 값을 작성한다. (소문자로 0x로 시작해도 된다.)

        System.out.println(num);
        System.out.println(bNum);
        System.out.println(oNum);
        System.out.println(xNum);
    }
}
