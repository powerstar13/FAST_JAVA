package ch04;

public class StringConcatTest {

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "World";

        // 객체 지향 프로그래밍 방식
        StringConcat stringConcat1 = new StringConcatImpl();
        stringConcat1.makeString(s1, s2);

        // 람다식 방식
        StringConcat stringConcat2 = (s, v) -> System.out.println(s + ", " + v);
        stringConcat2.makeString(s1, s2);

        // 익명 내부 클래스 방식 (람다식 방식이 컴파일되면 이 원리로 생성된다.)
        StringConcat stringConcat3 = new StringConcat() {

            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1 + ", " + s2);
            }
        };
        stringConcat3.makeString(s1, s2);
    }
}
