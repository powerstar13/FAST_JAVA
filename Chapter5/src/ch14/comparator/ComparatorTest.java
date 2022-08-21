package ch14.comparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

    /**
     * String 클래스의 경우 오름차순으로 이미 Caparable이 정의되어 있으므로 Comparator를 이용하여 내림차순으로 바꿀 수 있다.
     */
    @Override
    public int compare(String s1, String s2) {
        return (s1.compareTo(s2)) * -1 ;
    }
}

public class ComparatorTest {

    public static void main(String[] args) {

        Set<String> set = new TreeSet<>(new MyCompare()); // Comparator를 사용하는 방식을 TreeSet에 알려주어야 한다.
        set.add("aaa");
        set.add("ccc");
        set.add("bbb");

        System.out.println(set);
    }
}

