package ch08;

public class CharacterTest {

    public static void main(String[] args) {

        char ch1 = 'A'; // 예제이기 때문에 변수 뒤에 숫자를 쓰지만, 변수명에 숫자를 사용하는 방식은 좋은 프로그래밍이 아니다.
        System.out.println(ch1);
        System.out.println((int) ch1); // type casting 강제 형변환

        char ch2 = 66; // 문자에 강제로 숫자를 써 봤다.
        System.out.println(ch2);

        int ch3 = 67;
        System.out.println(ch3);
        System.out.println((char) ch3); // UNICODE는 ASCII랑 호환이 된다.

        char han = '한';
        char unicode = '\uD55C'; // UNICODE 값으로 표현하는 방법
        System.out.println(han);
        System.out.println(unicode);
    }
}
