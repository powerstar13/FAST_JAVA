package ch06;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {

    @Override
    public String apply(String s1, String s2) {
        if (s1.getBytes().length >= s2.getBytes().length) return s1;
        else return s2;
    }
}

public class ReduceTest {

    public static void main(String[] args) {

        String[] greetings = { "안녕하세요~~~", "hello", "Good moring", "반갑습니다^^" };

        System.out.println( // 람다식 직접 쓰는 방식
            Arrays.stream(greetings)
                .reduce("", (s1, s2) -> {

                    if (s1.getBytes().length >= s2.getBytes().length) return s1;
                    else return s2;
                })
        );

        System.out.println( // BinaryOperator 사용하여 직접 구현
            Arrays.stream(greetings)
                .reduce(new CompareString())
                .get()
        );
    }
}
