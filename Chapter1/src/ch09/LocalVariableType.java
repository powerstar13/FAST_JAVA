package ch09;

public class LocalVariableType {

    public static void main(String[] args) {
        // jdk version 10 이상이어야 함
        // var: variable의 약자이다.
        var i = 10; // int
        var j = 10.0; // double
        var str = "hello"; // String

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        var str2 = str;
        System.out.println(str2);

        str = "test";
        System.out.println(str);
//        str = 3; // 이미 할당된 str 변수의 메모리에는 String형이기 때문에 int 값을 담을 수 없다.
    }
}
