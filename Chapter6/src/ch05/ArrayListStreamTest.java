package ch05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("Tomas");
        stringList.add("Edward");
        stringList.add("Jack");

        Stream<String> stringStream = stringList.stream();
        stringStream.forEach(s -> System.out.println(s));

        System.out.println();

        stringList.stream()
            .sorted()
            .forEach(s -> System.out.print(s + "\t"));

        System.out.println();

        stringList.stream()
            .map(s -> s.length())
            .forEach(integer -> System.out.print(integer + "\t"));

        System.out.println();

        stringList.stream()
            .filter(s -> s.length() >= 5)
            .forEach(s -> System.out.print(s + "\t"));
    }
}
