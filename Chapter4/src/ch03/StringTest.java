package ch03;

public class StringTest {

    public static void main(String[] args) {

        String java = new String("java");
        String android = new String("android");

        System.out.println(System.identityHashCode(java));

        java = java.concat(android); // 위에서의 java와는 다른 주소로 할당된다.

        System.out.println(java);
        System.out.println(System.identityHashCode(java));
    }
}
